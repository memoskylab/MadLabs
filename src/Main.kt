fun main () {

    val costOfGas = 2.28
    val mileage = 25
    // Declare the variable distance below
    val distance: Int
    println("Enter the distance to be traveled between 400 and 600:")
    val userInput = readLine()
    distance = userInput?.toIntOrNull() ?: 100

    var totalForGas = (costOfGas / mileage) * distance
    totalForGas = Math.round(totalForGas * 100) / 100.00

    var totalMoneySaved = totalForGas + 200

    println("What's your name?")
    var name = readLine()
    // Write your code below
    println("What's your friend name?")
    var friendsName = readLine()

    println("What's your adjective?")
    var adjective = readLine()

    println("What's city that we are going to?")
    var city = readLine()

    println("What band we want to see?")
    var bandName = readLine()

    println("What kind of job you do and your $friendsName do in order to save a money?")
    var work = readLine()

    print("""
    A long time ago, $name and their friend $friendsName planned a(n) $adjective road trip to see their favorite band: $bandName. 
    The venue was $distance miles away which meant they needed to save $$totalForGas dollars to get there.\n
    Both of them worked as $work for the whole summer and managed to save up a total of $totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
}