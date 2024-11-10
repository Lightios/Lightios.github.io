import Assets from './assets';
import { getSkills } from './skills';
import type { Project } from '../types';

import {locale, locales, t} from '../../services/i18n.js';
import { get } from 'svelte/store';

export const items: Array<Project> = [
	{
		slug: 'master-system',
		color: '#e68510',
	    description: 'projects.master-system.description',

		shortDescription: 'projects.master-system.shortDescription',
		links: [], // { to: 'https://github.com/RiadhAdrani/slick-portfolio-svelte', label: 'GitHub' }
		logo: Assets.MasterSystem,
		name: 'Multi K.O. Tournament System',
		period: {
			from: new Date(2021, 10, 1),
			to: new Date()
		},
		skills: getSkills('python', 'kivy', 'pillow', 'fpdf2'),
		type: 'Desktop Application',
		category: 'Commercial',
		screenshots: [
			{
				label: 'Main screen',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/1.png?raw=true'
			},
			{
				label: 'Contact',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/2.png?raw=true'
			},
			{
				label: 'Tournament screen - 8 teams version',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/3.png?raw=true'
			},
			{
				label: 'Tournament screen - 16 teams version',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/4.png?raw=true'
			},
			{
				label: 'Graph zoom',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/5.png?raw=true'
			},
			{
				label: 'PDF preview',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/6.png?raw=true'
			},
		]
	},
	{
		slug: 'vl',
		color: '#2de80c',
		description: 'projects.vl.description',
		shortDescription: 'projects.vl.shortDescription',
		links: [], // { to: 'https://github.com/RiadhAdrani/slick-portfolio-svelte', label: 'GitHub' }
		logo: Assets.ValorantLineups,
		name: 'Valorant Lineups',
		period: {
			from: new Date(2021, 7, 1),
			to: new Date(2023, 7, 30)
		},
		skills: getSkills('python', 'kivy', 'kotlin', 'compose'),
		type: 'Mobile Application',

		category: 'Commercial',
		screenshots: [
			{
				label: 'Lineup selection',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/valorant_lineups/1.png?raw=true'
			},
			{
				label: 'Lineup description',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/valorant_lineups/2.png?raw=true'
			},
			{
				label: 'Map selection',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/valorant_lineups/3.png?raw=true'
			},
			{
				label: 'Agent selection',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/valorant_lineups/4.png?raw=true'
			}
		]
	},
	{
		slug: 'demiurg',
		color: '#0eaae3',
		shortDescription: 'projects.demiurg.shortDescription',
		description: 'projects.demiurg.description',
		links: [{ to: 'https://github.com/Lightios/Demiurg_Creator/', label: 'GitHub - Game Creator' }, { to: 'https://github.com/ushka1/project-demiurg/', label: 'GitHub - Game Interpreter'} ],
		logo: Assets.Demiurg,
		name: 'Demiurg',
		period: {
			from: new Date(2023, 2, 1),
			to: new Date(2023, 6, 30)
		},
		skills: getSkills('python', 'kivy'),
		type: 'Desktop Application',
		category: 'Academic',
		screenshots: [
			{
				label: 'Project selection',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/demiurg/1.png?raw=true'
			},
			{
				label: 'Creator map grid',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/demiurg/2.png?raw=true'
			},
			{
				label: 'Location edition',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/demiurg/3.png?raw=true'
			},
			{
				label: 'Quest making',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/demiurg/4.png?raw=true'
			},
			{
				label: 'Game start',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/demiurg/5.png?raw=true'
			},
			{
				label: 'Game',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/demiurg/6.png?raw=true'
			},
			{
				label: 'End of game',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/demiurg/7.png?raw=true'
			},
		]
	},
	{
		slug: 'daymath',
		color: '#5e95e3',
		shortDescription: 'projects.daymath.shortDescription',
		description: 'projects.daymath.description',
		links: [], // { to: 'https://github.com/RiadhAdrani/slick-portfolio-svelte', label: 'GitHub' }
		logo: Assets.DayMath,
		name: 'DayMath',
		period: {
			from: new Date(2024, 4, 1)
		},
		skills: getSkills('kotlin', 'compose', 'latex', 'python', 'manim'),
		type: 'Mobile Application',
		category: 'Commercial',

		screenshots: [
			{
				label: 'App start',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/daymath/1.png?raw=true'
			},
			{
				label: 'Test parameters',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/daymath/2.png?raw=true'
			},

			{
				label: 'Question',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/daymath/6.png?raw=true'
			},
			{
				label: 'Hint',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/daymath/5.png?raw=true'
			},
			{
				label: 'PDF',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/daymath/3.png?raw=true'
			},
			{
				label: 'Animation',
				src: 'https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/daymath/4.png?raw=true'
			},
		]
	},
	{
		slug: 'movie-ai',
		color: '#a818b8',
		shortDescription: 'projects.movie-ai.shortDescription',
		description: 'projects.movie-ai.description',
		links: [{ to: 'https://github.com/Lightios/MovieRecommendationSystem', label: 'GitHub' }],
		logo: Assets.Recommendation,
		name: 'Movie Recommendation System',
		period: {
			from: new Date(2024, 4, 1),
			to: new Date(2024, 5, 30)
		},
		skills: getSkills('svelte', 'ts', 'tailwind', 'sass'),
		type: 'Desktop application',
		category: 'Academic',
	}
];

export const title = 'Projects';
