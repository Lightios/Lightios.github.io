package pl.michal_cyran.portfolio.localise

import io.github.skeptick.libres.strings.PluralRules
import io.github.skeptick.libres.strings.PluralForm
import io.github.skeptick.libres.strings.PluralForm.Few
import io.github.skeptick.libres.strings.PluralForm.Many
import io.github.skeptick.libres.strings.PluralForm.One
import io.github.skeptick.libres.strings.PluralRule


fun add() {
    val plPluralRule = PluralRule { number ->
        when (number % 100) {
            11, 12, 13, 14 -> PluralForm.Other
            else -> when (number % 10) {
                1 -> One
                2, 3, 4 -> Few
                else -> PluralForm.Other
            }
        }
    }

    PluralRules["pl"] = plPluralRule
}
