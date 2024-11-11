class Destination {
    String city
    String state

    Destination(String city, String state) {
        this.city = city
        this.state = state
    }
}

private static int countCitiesInCalifornia(List<Destination> cities) {
    cities.count { it.state == "California" }
}

def cities = [
   new Destination("Atlanta", "Georgia"),
   new Destination("San Jose", "California"),
   new Destination("Denver", "Colorado"),
   new Destination("San Diego", "California")
]

def californiaCityCount = countCitiesInCalifornia(cities)
print "Visited ${cities.size()} cities " +
        "starting with ${cities.first().city}"
println " including $californiaCityCount in California"

