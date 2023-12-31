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

    val totalMoneySaved = totalForGas + 200

    println("What's your name?")
    val name = readLine()
    // Write your code below
    println("What's your friend name?")
    val friendsName = readLine()

    println("What's your adjective?")
    val adjective = readLine()

    println("What's city that we are going to?")
    val city = readLine()

    println("What band we want to see?")
    val bandName = readLine()

    println("What kind of job you do and your $friendsName do in order to save a money?")
    val work = readLine()

    print("""
    A long time ago, $name and their friend $friendsName planned a $adjective road trip to see their favorite band: $bandName. 
    The venue was $distance miles away which meant they needed to save $totalForGas dollars to get there.
    Both of them worked as $work for the whole summer and managed to save up a total of $totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
}