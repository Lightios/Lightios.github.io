package pl.michal_cyran.portfolio.education.data

import kotlinx.datetime.LocalDate
import pl.michal_cyran.portfolio.education.domain.Education
import pl.michal_cyran.portfolio.education.domain.Subject
import pl.michal_cyran.portfolio.education.domain.SubjectCategory

val education = listOf(
    Education(
        title = Res.string.education_zsz_degree,
        institution = Res.string.education_zsz_organization,
        location = Res.string.Poland,
        subjects = listOf(
            Subject(Res.string.Programming, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.Networking, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.HardwareMaintenance, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.OperatingSystems, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.Databases, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.WebProgramming, SubjectCategory.ProgrammingAndSoftwareEngineering),
        ),
        certificates = listOf(
            Res.string.CertificateCCNARoutingAndSwitchingIntroductionToNetworks,
            Res.string.CertificatePCAPProgrammingEssentialsInPython,
            Res.string.CertificateCPAProgrammingEssentialsInCPlusPlus,
            Res.string.CertificateNDGLinuxUnhatched,
            Res.string.CertificateIntroductionToCybersecurity,
            Res.string.CertificateCybersecurityEssentials,
            Res.string.CertificateBeYourOwnBoss,
            Res.string.CertificateGetConnected,
            Res.string.CertificateIntroductionToTheInternetOfEverything,
            Res.string.Certificate3dsMaxAnimation,
            Res.string.Certificate3dsMaxVisualisation,
            Res.string.Certificate3dsMaxModeling,
            Res.string.CertificateEUCodeWeek,
        ),
        icon = "zsz.png",
        startDate = LocalDate(2017, 9, 1),
        endDate = LocalDate(2021, 6, 30)
    ),
    Education(
        title = Res.string.education_uj_degree,
        institution = Res.string.education_uj_organization,
        location = Res.string.Poland,
        subjects = listOf(
            Subject(Res.string.ProgrammingMethods, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.ComputerOrganizationAndArchitecture, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.Algebra, SubjectCategory.Mathematics),
            Subject(Res.string.Programming, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.LogicAndSetTheory, SubjectCategory.Mathematics),
            Subject(Res.string.MathematicalAnalysis, SubjectCategory.Mathematics),
            Subject(Res.string.OperatingSystems, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.AlgorithmsAndDataStructures, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.DiscreteMathematics, SubjectCategory.Mathematics),
            Subject(Res.string.Databases, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.SoftwareEngineering, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.ProbabilityAndStatistics, SubjectCategory.Mathematics),
            Subject(Res.string.Networking, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.FormalLanguagesAndAutomata, SubjectCategory.Mathematics),
            Subject(Res.string.NumericalMethods, SubjectCategory.Mathematics),
            Subject(Res.string.FunctionalProgramming, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.AndroidProgramming, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.DesignPatterns, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.CSharpProgramming, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.CognitiveSystems, SubjectCategory.Other),
            Subject(Res.string.CognitiveScience, SubjectCategory.Other),
            Subject(Res.string.WebProgramming, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.FundamentalsOfAI, SubjectCategory.Other),
            Subject(Res.string.English, SubjectCategory.Other)
        ),

        certificates = emptyList(),
        icon = "uj.png",
        startDate = LocalDate(2021, 10, 1),
        endDate = LocalDate(2024, 6, 30),
    )
)