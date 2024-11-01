import Assets from './assets';
import { getSkills } from './skills';
import { ContractType, type Experience } from '../types';

export const items: Array<Experience> = [
	{
		slug: 'tutor',
		company: 'Self-employed',
		description: 'Teaching mathematics to students',
		contract: ContractType.SelfEmployed,
		type: 'Software Development',
		location: 'Home',
		period: {from: new Date(2021, 9, 1) },
		skills: getSkills(),
		name: 'Math Tutor',
		color: 'green',
		links: [],
		logo: Assets.Math,
		shortDescription: 'Teaching mathematics to students',
		category: "self-employed",
	},
	{
		slug: 'software-freelance',
		company: 'Self-employed',
		description: 'Creating awesome applications for customers.',
		contract: ContractType.Freelance,
		type: 'Software Development',
		location: 'Home',
		period: { from: new Date(2021, 9, 1) },
		skills: getSkills('python', 'kivy'),
		name: 'Freelancer',
		color: 'blue',
		links: [],
		logo: Assets.Freelance,
		shortDescription: 'Creating awesome applications for customers.',
		category: "self-employed",
	},
];

export const title = 'Experience';
