<script lang="ts">
	import { items, title } from '@data/projects';
	import * as skills from '@data/skills';
	import { onMount } from 'svelte';

	import type { Project, Skill } from '$lib/types';

	import Chip from '$lib/components/Chip/Chip.svelte';
	import ProjectCard from '$lib/components/ProjectCard/ProjectCard.svelte';
	import SearchPage from '$lib/components/SearchPage.svelte';
	import UIcon from '$lib/components/Icon/UIcon.svelte';
	import {t} from "../../services/i18n";

	interface SkillFilter extends Skill {
		isSelected?: boolean;
	}

	let filters: Array<SkillFilter> = skills.items.filter((it) => {
		return items.some((project) => project.skills.some((skill) => skill.slug === it.slug));
	});

	let search = '';
	let displayed: Array<Project> = [];

	const isSelected = (slug: string): boolean => {
		return filters.some((item) => item.slug === slug && item.isSelected);
	};

	const onSelected = (slug: string) => {
		filters = filters.map((tech) => {
			if (tech.slug === slug) {
				tech.isSelected = !isSelected(slug);
			}

			return tech;
		});
	};

	function groupProjectsByCategory(projects: Array<Project>) {
        return projects.reduce((acc, project) => {
            const category = project.category || 'Uncategorized';
            if (!acc[category]) {
                acc[category] = [];
            }
            acc[category].push(project);
            return acc;
        }, {});
    }

$: groupedProjects = groupProjectsByCategory(items);
$: displayed = Object.entries(groupedProjects).reduce((acc, [category, projects]) => {
    const filteredProjects = projects.filter(project => {
        const isFiltered =
            filters.every(item => !item.isSelected) ||
            project.skills.some(tech =>
                filters.some(filter => filter.isSelected && filter.slug === tech.slug)
            );
        const isSearched =
            search.trim().length === 0 ||
            project.name.trim().toLowerCase().includes(search.trim().toLowerCase());
        return isFiltered && isSearched;
    });
    if (filteredProjects.length > 0) {
        acc[category] = filteredProjects;
    }
    return acc;
}, {});

	const onSearch = (e: CustomEvent<{ search: string }>) => {
		search = e.detail.search;
	};

	onMount(() => {
		const query = location.search;

		if (query) {
			const queryParams = new URLSearchParams(location.search);

			const item = queryParams.get('item');

			if (item) {
				search = item;
			}
		}
	});
</script>

<SearchPage {title} on:search={onSearch}>
	<div class="projects-filters">
		{#each filters as tech}
			<Chip active={tech.isSelected} classes={'text-0.8em'} on:click={() => onSelected(tech.slug)}
				>{tech.name}</Chip
			>
		{/each}
	</div>
	{#if Object.keys(displayed).length === 0}
    <div class="p-5 col-center gap-3 m-y-auto text-[var(--accent-text)] flex-1">
        <UIcon icon="i-carbon-cube" classes="text-3.5em" />
        <p class="font-300">Could not find anything...</p>
    </div>
{:else}
    {#each Object.entries(groupedProjects) as [category, projects]}
  <section>
    <h2>{$t(category)}</h2>
    <div class="projects-list">
      {#each projects as project}
        <ProjectCard {project} />
      {/each}
    </div>
  </section>
{/each}
{/if}
</SearchPage>

<style lang="scss">
	.projects-list {
		display: grid;
		grid-template-columns: repeat(3, 1fr);
		gap: 20px;

		@media (max-width: 1350px) {
			grid-template-columns: repeat(2, 1fr);
		}
		@media (max-width: 850px) {
			grid-template-columns: repeat(1, 1fr);
		}
	}
</style>
