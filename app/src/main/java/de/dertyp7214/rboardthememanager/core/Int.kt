package de.dertyp7214.rboardthememanager.core

import android.graphics.Color

fun Int.changeAlpha(alpha: Int): Int {
    return Color.argb(
        alpha,
        Color.red(this),
        Color.green(this),
        Color.blue(this)
    )
}

fun lerp(a: Int, b: Int, f: Float): Float = a + (f * (a - b).toFloat())