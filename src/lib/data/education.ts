import Assets from './assets';
import type { Education } from '../types';

export const items: Array<Education> = [
	{
	  degree: 'Technician of Information Technology',
	  description: 'A comprehensive program covering various aspects of computer science and information technology, including programming, networking, and hardware maintenance.',
	  location: 'Poland',
	  logo: Assets.ZSZ, // Replace with a specific logo if available
	  name: 'Technical High School of Computer Science',
	  organization: 'Zespół Szkół Zawodowych w Przeworsku',
	  period: { from: new Date(2016, 8, 1), to: new Date(2021, 5, 1) },
	  shortDescription: 'Specialized in Information Technology',
	  slug: 'technical-high-school-computer-science',
	  subjects: ['Programming', 'Networking', 'Hardware Maintenance', 'Operating Systems', 'Databases',
		  'Certificate: CCNA Routing and Switching: Introduction to Networks',
		  'Certificate: PCAP: Programming Essentials in Python',
		  'Certificate: NDG Linux Unhatched',
		  'Certificate: Introduction to Cybersecurity',
		  'Certificate: Cybersecurity Essentials',
		  'Certificate: Be Your Own Boss',
		  'Certificate: Get Connected',
		  'Certificate: Introduction to the Internet of Everything',
		  'Certificate: 3ds Max Animation',
		  'Certificate: 3ds Max Visualisation',
		  'Certificate: 3ds Max Modeling',
		  'Certificate: EU Code Week',
		  'Certificate: CPA: Programming Essentials in C++',
	  ]
	},
	{
		degree: 'Bachelor degree of Computer Science',
		description: '',
		location: 'Poland',
		logo: Assets.UJ,
		name: '',
		organization: 'Jagiellonian University',
		period: { from: new Date(2021, 9, 1), to: new Date(2024, 9, 1) },
		shortDescription: '',
		slug: 'dummy-education-item',
		subjects: ['Algebra', 'Computer Organization and Architecture', 'Programming', 'Logic and Set Theory', 'Mathematical Analysis', 'Programming Methods', 'Operating Systems', 'Algorithms and Data Structures', 'Discrete Mathematics', 'Databases', 'Software Engineering', 'Probability and Statistics', 'Computer Networks', 'Formal Languages and Automata', 'Numerical Methods', 'Functional Programming', 'Android Programming', 'Design Patterns', 'C# Programming', 'Cognitive Systems', 'Cognitive Science', 'Web Programming', 'Fundamentals of AI', 'English',]
	}
];

export const title = 'Education';
