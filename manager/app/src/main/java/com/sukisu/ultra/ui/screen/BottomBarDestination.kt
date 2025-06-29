package com.fern.ksu.ui.screen

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.filled.Archive
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.ramcosta.composedestinations.generated.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.generated.destinations.ModuleScreenDestination
import com.ramcosta.composedestinations.generated.destinations.SuperUserScreenDestination
import com.ramcosta.composedestinations.generated.destinations.SettingScreenDestination
import com.ramcosta.composedestinations.generated.destinations.KpmScreenDestination
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec
import com.fern.ksu.R

enum class BottomBarDestination(
    val direction: DirectionDestinationSpec,
    @StringRes val label: Int,
    val iconSelected: ImageVector,
    val iconNotSelected: ImageVector,
    val rootRequired: Boolean,
) {
    Home(HomeScreenDestination, R.string.home, Icons.Filled.Home, Icons.Outlined.Home, false),
    Kpm(KpmScreenDestination, R.string.kpm_title, Icons.Filled.Archive, Icons.Outlined.Archive, true),
    SuperUser(SuperUserScreenDestination, R.string.superuser, Icons.Filled.AdminPanelSettings, Icons.Outlined.AdminPanelSettings, true),
    Module(ModuleScreenDestination, R.string.module, Icons.Filled.Extension, Icons.Outlined.Extension, true),
    Settings(SettingScreenDestination, R.string.settings, Icons.Filled.Settings, Icons.Outlined.Settings, false),
}
