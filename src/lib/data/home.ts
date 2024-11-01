import { Platform } from '$lib/types';
import { getSkills } from './skills';

export const title = 'Home';

export const name = 'Michał';

export const lastName = 'Cyran';

export const description =
	'An IT professional with a Bachelor\'s degree in Computer Science from Jagiellonian University and a background from a technical high school in IT. I have experience as a mathematics tutor, where I honed my communication and problem-solving skills. I am eager to apply my knowledge and enthusiasm in a dynamic IT environment, contributing to innovative projects and solutions.';

export const links: Array<{ platform: Platform; link: string }> = [
	{
		platform: Platform.GitHub,
		link: 'https://github.com/Lightios/'
	},

	{
		platform: Platform.Email,
		link: 'michalcyran77777@gmail.com'
	},

	{
		platform: Platform.Superprof,
		link: 'https://www.superprof.pl/matura-maju-moze-potrzebujesz-pomocy-lekcjami-napisz-mnie-poradzisz-sobie-matematyka-bez-problemu.html'
	},

	{
		platform: Platform.LeetCode,
		link: 'https://leetcode.com/u/Lightios/'
	},
];

export const skills = getSkills('python', 'kotlin', 'c#', 'kivy', 'compose');
