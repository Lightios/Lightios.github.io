import Assets from './assets';
import { getSkills } from './skills';
import type { Project } from '../types';

export const items: Array<Project> = [
	{
		slug: 'master-system',
		color: '#e68510',
		description:
			'This tournament management application was developed on commission to facilitate competitive match play according to a client-specific algorithm. The app provides a user-friendly interface for entering match results, automatically pairs teams for the next round based on the algorithm, calculates points, and generates comprehensive PDF summaries of the tournament\'s progress. Additionally, it creates graphs to visually represent the algorithm\'s logic and outcomes. The application is translated into four languages using Python\'s gettext module, ensuring accessibility for a diverse user base. This project showcases my ability to deliver tailored, multilingual software solutions that meet specific client requirements and enhance the management of complex tournament structures.\n\n Owner contact information in included on a screenshot]',
		shortDescription:
			'Tournament management app with custom algorithm, match results, team pairing, points calculation, PDF summaries, and multi-language support using Python gettext.',
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
		description:
			'Valorant Lineups is a comprehensive mobile application tailored for Valorant players to enhance their in-game strategies. The app offers a vast collection of lineups, enabling players to execute advanced techniques without the need for extensive memorization. By providing real-time guidance and detailed instructions, Valorant Lineups streamlines the learning process and empowers players to perform at their best, improving both individual and team performance.',
		shortDescription:
			'Mobile app for Valorant players to use in-game lineups without prior memorization, enhancing gameplay strategies.',
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
		shortDescription:
			'Text-based game creator and interpreter, developed in a team, enabling users to design and play complex interactive narratives.',
		description:
			'Demiurg is a comprehensive application developed as part of a Software Engineering course, created by a team of five. The project includes a robust game creator and interpreter for text-based games, allowing users to design intricate game worlds with advanced mechanics such as non-linear quests and dynamic storylines. The creator empowers users to craft detailed interactive narratives, while the interpreter provides an immersive experience for playing these games. This project showcases our collaborative effort and proficiency in software development, highlighting our ability to deliver sophisticated tools for creative expression.',
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
		shortDescription:
			'Educational app for Polish students, featuring math quizzes, explanations, and animations, still in development.',
		description:
			'DayMath is a comprehensive educational application I developed independently during my university studies, targeting students in Polish primary and secondary schools. The app is designed to enhance mathematical learning through a variety of interactive features, including math quizzes, detailed textual explanations of various topics, and animations that visualize and clarify complex problems. These tools work together to provide an engaging and effective learning experience. Although the app is still a work in progress and has not been officially released, it represents my commitment to improving education through technology and my ongoing efforts to refine and expand its capabilities.',
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
		shortDescription:
			'Desktop app recommending movies based on user ratings, developed for a course on AI fundamentals with a colleague.',
		description:
			'The Movie Recommendation System is a desktop application created in collaboration with a colleague as part of a Fundamentals of Artificial Intelligence course. This app enables users to rate movies they have watched, and employs AI algorithms to recommend new movies tailored to their preferences. By analyzing user ratings and employing sophisticated recommendation techniques, the system provides personalized movie suggestions, enhancing the user’s viewing experience. This project highlights our practical application of AI principles and our ability to develop user-centric, intelligent software solutions.',
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
