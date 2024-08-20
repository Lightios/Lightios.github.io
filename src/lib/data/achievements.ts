import Assets from './assets';
import { getSkills } from './skills';
import {type Achievement, ContractType, type Experience} from '../types';

export const items: Array<Achievement> = [
    {
        slug: 'tutor',
        description: 'Teaching mathematics to students',
        name: 'Math Tutor',
        organization: '',
        date: new Date(2021, 10, 1),
        logo: '',
        shortDescription: ''
    }
];

export const title = 'Achievements';
