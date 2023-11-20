package com.shorbgy.gifts

import androidx.annotation.DrawableRes

data class Gift(
    val desc: String = "25 MBS + 15 Social MBS",
    val day: String = "Day 1",
    @DrawableRes val img: Int = R.drawable.current_bg
)
