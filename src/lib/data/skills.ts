import Assets from './assets';
import type { Skill, SkillCategory } from '../types';
import svelte from '../md/svelte.md?raw';
import { omit, type StringWithAutoComplete } from '@riadh-adrani/utils';

const defineSkillCategory = <S extends string>(data: SkillCategory<S>): SkillCategory<S> => data;

const categories = [
	defineSkillCategory({ name: 'Programming Languages', slug: 'pro-lang' }),
	defineSkillCategory({ name: 'Frameworks', slug: 'framework' }),
	defineSkillCategory({ name: 'Libraries', slug: 'library' }),
	defineSkillCategory({ name: 'Languages', slug: 'lang' }),
	defineSkillCategory({ name: 'Databases', slug: 'db' }),
	defineSkillCategory({ name: 'ORMs', slug: 'orm' }),
	defineSkillCategory({ name: 'DevOps', slug: 'devops' }),
	defineSkillCategory({ name: 'Testing', slug: 'test' }),
	defineSkillCategory({ name: 'Dev Tools', slug: 'devtools' }),
	defineSkillCategory({ name: 'Markup Style', slug: 'markup-style' }),
	defineSkillCategory({ name: 'Design', slug: 'design' }),
	defineSkillCategory({ name: 'Soft Skills', slug: 'soft' })
] as const;

const defineSkill = <S extends string>(
	skill: Omit<Skill<S>, 'category'> & {
		category?: StringWithAutoComplete<(typeof categories)[number]['slug']>;
	}
): Skill<S> => {
	const out: Skill<S> = omit(skill, 'category');

	if (skill.category) {
		out.category = categories.find((it) => it.slug === skill.category);
	}

	return out;
};

export const items = [
	defineSkill({
		slug: 'python',
		color: 'blue',
		description:
			'Python is an interpreted, high-level and general-purpose programming language. Python\'s design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.',
		logo: Assets.Python,
		name: 'Python',
		category: 'pro-lang'
	}),
	defineSkill({
		slug: 'kotlin',
		color: 'purple',
		description:
			'Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to be fully interoperable with Java, and the JVM version of its standard library depends on the Java Class Library, but type inference allows its syntax to be more concise. Kotlin mainly targets the JVM, but also compiles to JavaScript or native code (via LLVM). Kotlin is sponsored by JetBrains and Google through the Kotlin Foundation.',
		logo: Assets.Kotlin,
		name: 'Kotlin',
		category: 'pro-lang'
	}),
	defineSkill({
		slug: 'c#',
		color: 'purple',
		description:
			'C# is a general-purpose, multi-paradigm programming language encompassing strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines. It was developed around 2000 by Microsoft within its .NET initiative and later approved as a standard by Ecma (ECMA-334) and ISO (ISO/IEC 23270:2018). C# is one of the programming languages designed for the Common Language Infrastructure.',
		logo: Assets.Csharp,
		name: 'C#',
		category: 'pro-lang'
	}),
	defineSkill({
		slug: 'latex',
		color: 'cyan',
		description:
			'LaTeX is a software system for document preparation. When writing, the writer uses plain text as opposed to the formatted text found in WYSIWYG ("what you see is what you get") word processors like Microsoft Word, LibreOffice Writer, and Apple Pages. The writer uses markup tagging conventions to define the general structure of a document (such as article, book, and letter), to stylize text throughout a document (such as bold and italics), and to add citations and cross-references. A TeX distribution such as TeX Live or MiKTeX is used to produce an output file (such as PDF or DVI) suitable for printing or digital distribution.',
		logo: Assets.Latex,
		name: 'LaTeX',
		category: 'markup-style'
	}),
	defineSkill({
		slug: 'html',
		color: 'orange',
		description:
			'HTML (HyperText Markup Language) is the most basic building block of the Web. It defines the meaning and structure of web content. Other technologies besides HTML are generally used to describe a web page\'s appearance/presentation (CSS) or functionality/behavior (JavaScript).',
		logo: Assets.HTML,
		name: 'HTML',
		category: 'markup-style'
	}),
	defineSkill({
		slug: 'css',
		color: 'blue',
		description:
			'CSS',
		logo: Assets.CSS,
		name: 'CSS',
		category: 'markup-style'
	}),
	defineSkill({
		slug: 'kivy',
		color: 'cyan',
		description:
			'Kivy is an open-source Python library for developing multitouch applications. It is cross-platform (Linux/OS X/Windows/Android/iOS) and released under the MIT license. The framework is stable and has a well-documented API, plus a programming guide to help you get started.',
		logo: Assets.KivyMD,
		name: 'KivyMD',
		category: 'framework'
	}),
	defineSkill({
		slug: 'compose',
		color: 'green',
		description:
			'Jetpack Compose is a modern toolkit for building native Android UI. Jetpack Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.',
		logo: Assets.Compose,
		name: 'Jetpack Compose',
		category: 'framework'
	}),
	defineSkill({
		slug: 'manim',
		color: 'green',
		description:
			'Manim is a mathematical animation engine for explanatory math videos. It is powered by Python and many of its libraries, but it is not a library itself. It is a command-line tool that uses Python scripts to generate animations.',
		logo: Assets.Manim,
		name: 'Manim',
		category: 'framework'
	}),
	defineSkill({
		slug: 'pillow',
		color: 'green',
		description:
			'Pillow is the friendly PIL fork by Alex Clark and Contributors. PIL is the Python Imaging Library by Fredrik Lundh and Contributors.',
		logo: Assets.Pillow,
		name: 'Pillow',
		category: 'library'
	}),
	defineSkill({
		slug: 'fpdf2',
		color: 'green',
		description:
			'FPDF2 is a PDF document generator with support for UTF-8, Unicode, RTL languages, and HTML.',
		logo: Assets.FPDF2,
		name: 'FPDF2',
		category: 'library'
	}),
	defineSkill({
		slug: 'pl',
		color: 'red',
		description: '',
		logo: Assets.Polish,
		name: 'Polish',
		category: 'lang'
	}),
	defineSkill({
		slug: 'en',
		color: 'blue',
		description: '',
		logo: Assets.English,
		name: 'English (C1)',
		category: 'lang'
	}),
] as const;

export const title = 'Skills';

export const getSkills = (
	...slugs: Array<StringWithAutoComplete<(typeof items)[number]['slug']>>
): Array<Skill> => items.filter((it) => slugs.includes(it.slug));

export const groupByCategory = (
	query: string
): Array<{ category: SkillCategory; items: Array<Skill> }> => {
	const out: ReturnType<typeof groupByCategory> = [];

	const others: Array<Skill> = [];

	items.forEach((item) => {
		if (query.trim() && !item.name.toLowerCase().includes(query.trim().toLowerCase())) return;

		// push to others if item does not have a category
		if (!item.category) {
			console.log(item.category);
			others.push(item);
			return;
		}

		// check if category exists
		let category = out.find((it) => it.category.slug === item.category?.slug);

		if (!category) {
			category = { items: [], category: item.category };

			out.push(category);
		}

		category.items.push(item);
	});

	if (others.length !== 0) {
		out.push({ category: { name: 'Others', slug: 'others' }, items: others });
	}

	return out;
};
