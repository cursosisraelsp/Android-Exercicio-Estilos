package com.example.woof.funcions

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

fun isClickExpanded(expanded: Boolean): ImageVector{
    val imagen : ImageVector
    if (expanded) imagen = Icons.Filled.ExpandMore else imagen = Icons.Filled.ExpandLess
    return imagen
}

@Composable
fun isChangedBackgroundColor(expanded: Boolean):Color{
    val cor : Color
    if (expanded) cor = MaterialTheme.colorScheme.tertiaryContainer
    else cor = MaterialTheme.colorScheme.primaryContainer

    return cor
}