package com.bogdanovshumila.student_material_design.data

import android.accessibilityservice.GestureDescription
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Student (
    @DrawableRes val imageResourseId: Int,
    @StringRes val name: Int ,
    val age: Int,
    @StringRes val description: Int
)
