package com.my.test.res

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import test.composeapp.generated.resources.OpenSans_Bold
import test.composeapp.generated.resources.OpenSans_Light
import test.composeapp.generated.resources.OpenSans_Medium
import test.composeapp.generated.resources.OpenSans_Regular
import test.composeapp.generated.resources.Quicksand_Bold
import test.composeapp.generated.resources.Quicksand_Light
import test.composeapp.generated.resources.Res

@Composable
fun QuicksandFontFamily(): FontFamily {
    return FontFamily(
        Font(Res.font.Quicksand_Bold, FontWeight.Bold, FontStyle.Normal),
        Font(Res.font.Quicksand_Light, FontWeight.Light, FontStyle.Normal),

    )
}

@Composable
fun OpenSansFontFamily(): FontFamily {
    return FontFamily(
        Font(Res.font.OpenSans_Bold, FontWeight.Bold, FontStyle.Normal),
        Font(Res.font.OpenSans_Medium, FontWeight.Medium, FontStyle.Normal),
        Font(Res.font.OpenSans_Light, FontWeight.Light, FontStyle.Normal),
        Font(Res.font.OpenSans_Regular, FontWeight.ExtraLight, FontStyle.Normal),
    )
}