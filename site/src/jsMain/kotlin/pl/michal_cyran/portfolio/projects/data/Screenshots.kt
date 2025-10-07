package pl.michal_cyran.portfolio.projects.data

import pl.michal_cyran.portfolio.projects.domain.Screenshot

val path = "screenshots/"

fun generateScreenshotPath(name: String, index: Int): String {
    return "${path}ss_${name}_$index.png"
}


fun generateScreenshots(name: String, labels: List<String>): List<Screenshot> {
    return labels.mapIndexed { index, label ->
        Screenshot(
            resource = generateScreenshotPath(name, index + 1),
            label = label
        )
    }
}

val daymathLabels = listOf(
    "Ekran główny",
    "Pytanie prawda/fałsz",
    "Pytanie abcd",
    "Wyjaśnienie",
    "Podsumowanie testu",
    "Generator równań",
    "Wskazówka"
)

val daymathScreenshots = generateScreenshots(
    name = "daymath",
    labels = daymathLabels
)

val demiurgLabels = listOf(
    "Project selection",
    "Creator map grid",
    "Location edition",
    "Quest making",
    "Game start",
    "Game",
    "End of game"
)
val demiurgScreenshots = generateScreenshots(
    name = "demiurg",
    labels = demiurgLabels
)

val generatorTabliczekLabels = listOf(
    "Główne okno",
    "Parametry napisu",
    "Wybór kolorów",
    "Eksport do PDF"
)

val generatorTabliczekScreenshots = generateScreenshots(
    name = "generator_tabliczek",
    labels = generatorTabliczekLabels
)

val schedulerLabels = listOf(
    "Ekran główny",
    "Ustawienia",
    "Integracja z Discordem",
    "Wyniki"
)
val schedulerScreenshots = generateScreenshots(
    name = "scheduler",
    labels = schedulerLabels
)

val msLabels = listOf(
    "Ekran główny",
    "Kontakt",
    "Ekran turnieju - 8 drużyn",
    "Ekran turnieju - 16 drużyn",
    "Powiększenie grafu",
    "Podgląd PDF"
)
val masterSystemScreenshots = generateScreenshots(
    name = "master_system",
    labels = msLabels
)

val vlLabels = listOf(
    "Wybór lineupa",
    "Ekran lineupa",
    "Wybór mapy",
    "Wybór agenta"
)

val valorantLineupsScreenshots = generateScreenshots(
    name = "vl",
    labels = vlLabels
)