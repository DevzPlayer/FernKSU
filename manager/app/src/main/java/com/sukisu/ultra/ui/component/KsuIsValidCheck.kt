package com.fern.ksu.ui.component

import androidx.compose.runtime.Composable
import com.fern.ksu.Natives
import com.fern.ksu.ksuApp

@Composable
fun KsuIsValid(
    content: @Composable () -> Unit
) {
    val isManager = Natives.becomeManager(ksuApp.packageName)
    val ksuVersion = if (isManager) Natives.version else null

    if (ksuVersion != null) {
        content()
    }
}