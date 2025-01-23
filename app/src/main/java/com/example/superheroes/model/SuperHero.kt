package com.example.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SuperHero(
    @StringRes val superHeroNameId:Int,
    @DrawableRes val superHeroImageId:Int,
    @StringRes val superHeroDescId:Int
)
