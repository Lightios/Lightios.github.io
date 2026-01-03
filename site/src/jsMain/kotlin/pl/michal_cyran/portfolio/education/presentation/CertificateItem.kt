package pl.michal_cyran.portfolio.education.presentation

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Text

@Composable
fun CertificateItem(certificate: String) {
    Li {
        Text(
            certificate,
        )
    }
}