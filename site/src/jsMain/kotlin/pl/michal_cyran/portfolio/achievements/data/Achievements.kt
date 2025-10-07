package pl.michal_cyran.portfolio.achievements.data

import kotlinx.datetime.LocalDate
import pl.michal_cyran.portfolio.achievements.domain.Achievement
import pl.michal_cyran.portfolio.achievements.domain.AchievementCategory
import pl.michal_cyran.portfolio.achievements.domain.AchievementLevel

val achievements = listOf(
    Achievement(
        name = Res.string.FirstPlaceInTheIndependenceDictationContest,
        organization = "Zespół Szkół Zawodowych w Przeworsku",
        date = LocalDate(2021, 11, 1),
        category = AchievementCategory.OTHER,
        level = AchievementLevel.NATIONAL,
        isFirstPlace = true
    ),

    Achievement(
        name = Res.string.PrzeworskCountyScholarship,
        organization = "Starosta Przeworski",
        date = LocalDate(2020, 12, 1),
        category = AchievementCategory.SCHOLARSHIP,
        level = AchievementLevel.REGIONAL
    ),
    Achievement(
        name = Res.string.FirstPlaceInTheExpertGroupAtThePix2019ContestNationalSchoolProgrammingChampionship,
        organization = "eduLAB",
        date = LocalDate(2019, 12, 1),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.NATIONAL,
        isFirstPlace = true
    ),

    Achievement(
        name = Res.string.QualificationToTheSemiFinalsOfThePolishEditionOfTheInternationalPixProgrammingChallenge,
        organization = "eduLAB",
        date = LocalDate(2019, 12, 13),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.NATIONAL
    ),

    Achievement(
        name = Res.string.HonorableMentionInTheNationalHistoryContestKrag,
        organization = "Stowarzyszenie Upowszechniania Wiedzy i Kultury Regionalnej 'Pokolenie'",
        date = LocalDate(2019, 12, 1),
        category = AchievementCategory.OTHER,
        level = AchievementLevel.NATIONAL
    ),

    Achievement(
        name = Res.string.PrzeworskCountyScholarship,
        organization = "Starosta Przeworski",
        date = LocalDate(2019, 12, 1),
        category = AchievementCategory.SCHOLARSHIP,
        level = AchievementLevel.REGIONAL
    ),

    Achievement(
        name = Res.string.PrzeworskCountyScholarship,
        organization = "Starosta Przeworski",
        date = LocalDate(2018, 11, 18),
        category = AchievementCategory.SCHOLARSHIP,
        level = AchievementLevel.REGIONAL
    ),

    Achievement(
        name = Res.string.HonorableMentionInTheInternationalMathContestKangurMatematyczny,
        organization = "Wydział Matematyki i Informatyki UMK w Toruniu",
        date = LocalDate(2017, 6, 26),
        category = AchievementCategory.MATH,
        level = AchievementLevel.INTERNATIONAL
    ),

    Achievement(
        name = Res.string.SecondPlaceInThe24thProfJanMarszalMathematicsContestForMiddleSchools,
        organization = "I Liceum Ogólnokształcące w im. H. Sienkiewicza w Łańcucie",
        date = LocalDate(2017, 3, 10),
        category = AchievementCategory.MATH,
        level = AchievementLevel.REGIONAL,
    ),

    Achievement(
        name = Res.string.FirstPlaceInTheSchoolProgrammingContest,
        organization = "Zespół Szkół w Markowej",
        date = LocalDate(2017, 6, 12),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.SCHOOL,
        isFirstPlace = true
    ),

    Achievement(
        name = Res.string.HonorableMentionInThe15thDistrictMathContestProcent,
        organization = "Zespół Szkół im. A. Mickiewicza w Żołyni",
        date = LocalDate(2017, 6, 5),
        category = AchievementCategory.MATH,
        level = AchievementLevel.DISTRICT
    ),

    Achievement(
        name = Res.string.FirstPlaceInTheSchoolProgrammingContest,
        organization = "Zespół Szkół w Markowej",
        date = LocalDate(2016, 6, 12),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.SCHOOL,
        isFirstPlace = true
    ),

    Achievement(
        name = Res.string.FirstPlaceInThe14thDistrictMathContestForSecondYearMiddleSchoolStudents,
        organization = "Publiczne Gimnazjum nr 1 w Łańcucie",
        date = LocalDate(2016, 6, 9),
        category = AchievementCategory.MATH,
        level = AchievementLevel.DISTRICT,
        isFirstPlace = true
    ),

    Achievement(
        name = Res.string.SecondPlaceInTheSchoolEnglishContest,
        organization = "Zespół Szkół w Markowej",
        date = LocalDate(2016, 6, 24),
        category = AchievementCategory.OTHER,
        level = AchievementLevel.SCHOOL
    )
)

