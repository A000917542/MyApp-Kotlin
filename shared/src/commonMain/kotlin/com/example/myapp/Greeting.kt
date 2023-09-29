package com.example.myapp

import daysUntilNewYear
import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "Hi!" else "Hello!")
        add("Guess what it is! > ${platform.name.reversed()}!")
        add("\nThere are only ${daysUntilNewYear()} days left until New Years!")
    }
}