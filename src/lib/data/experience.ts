import Assets from './assets';
import { getSkills } from './skills';
import { ContractType, type Experience } from '../types';

export const items: Array<Experience> = [
	{
		slug: 'tutor',
		company: 'Self-employed',
		description: 'experience.tutor.description',
		contract: ContractType.SelfEmployed,
		type: 'Software Development',
		location: 'Home',
		period: {from: new Date(2021, 9, 1) },
		skills: getSkills(),
		name: 'experience.tutor.name',
		color: 'green',
		links: [],
		logo: Assets.Math,
		shortDescription: 'experience.tutor.shortDescription',
		category: "self-employed",
	},
	{
		slug: 'software-freelance',
		company: 'Self-employed',
		description: 'experience.freelancer.shortDescription',
		contract: ContractType.Freelance,
		type: 'Software Development',
		location: 'Home',
		period: { from: new Date(2021, 9, 1) },
		skills: getSkills('python', 'kivy'),
		name: 'experience.freelancer.name',
		color: 'blue',
		links: [],
		logo: Assets.Freelance,
		shortDescription: 'experience.freelancer.shortDescription',
		category: "self-employed",
	},
];

export const title = 'Experience';
