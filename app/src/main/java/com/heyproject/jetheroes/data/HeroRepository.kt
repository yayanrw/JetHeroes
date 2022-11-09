package com.heyproject.jetheroes.data

import com.heyproject.jetheroes.model.Hero
import com.heyproject.jetheroes.model.HeroesData

/**
Written by Yayan Rahmat Wijaya on 11/9/2022 21:21
Github : https://github.com/yayanrw
 **/

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}