package com.mbahrami900913.mb_noteapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mbahrami900913.mb_noteapp.R
val almaraiFamily = FontFamily(
    Font(R.font.almarai_light, FontWeight.Light),
    Font(R.font.almarai_regular, FontWeight.Normal),
    Font(R.font.almarai_extrabold, FontWeight.ExtraBold),
    Font(R.font.almarai_bold, FontWeight.Bold)
)
val Typography = Typography(

    body1 = TextStyle(
        fontFamily = almaraiFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 25.sp
    )
)