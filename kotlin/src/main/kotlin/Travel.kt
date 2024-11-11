package com.wiley.realworldjava.more

class Destination(val city: String, val state: String)

fun countCitiesInCalifornia(cities: List<Destination>): Int {
    return cities.count { it.state == "California" }
}

fun main() {
    val cities = listOf(Destination("Atlanta", "Georgia"),
        Destination("San Jose", "California"),
        Destination("Denver", "Colorado"),
        Destination("San Diego", "California"))

    val californiaCityCount = countCitiesInCalifornia(cities)
    print("Visited ${cities.size} cities " +
            "starting with ${cities.first().city}");
    println(" including $californiaCityCount in California")
}
