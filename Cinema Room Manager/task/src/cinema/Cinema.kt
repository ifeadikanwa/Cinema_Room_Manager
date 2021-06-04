package cinema


import java.util.*
import java.util.function.DoubleUnaryOperator

var takenSeats = mutableListOf<Pair<Int,Int>>()
var rows = 0
var seats = 0
var totalSeats = 0
var income = 0
var totalIncome = 0
val scanner = Scanner(System.`in`)



private fun showCinemaImproved(rows: Int, seats: Int, takenSeat: MutableList<Pair<Int, Int>>) {
    println("Cinema:")
    for (i in 1..rows + 1) {

        for (j in 1..seats + 1) {
            if (Pair(i-1, j-1) in takenSeat) {
                print(" B")
            } else if (i == 1) {
                if (j == 1) print(" ") else print(" " + (j - 1))
            } else {
                if (j == 1) print(i - 1) else print(" S")
            }
        }

        println()
    }
}

fun executeUserChoice(userChoice: Int) {
    when (userChoice) {
        1 -> {
            showCinemaImproved(rows, seats, takenSeats)
            showMenu()
        }
        2 -> {
            println("Enter a row number:")
            val userRow = scanner.nextInt()

            println("Enter a seat number in that row:")
            val userSeat = scanner.nextInt()

            if (userRow > rows || userSeat > seats){
                println("Wrong Input")
                executeUserChoice(2)
            }
            else if(Pair(userRow, userSeat) in takenSeats) {
                println("That ticket has already been purchased!")
                executeUserChoice(2)
            }
            else{
                takenSeats.add(Pair(userRow,userSeat))

                val ticketPrice =
                    if (totalSeats < 60) {
                        10
                    } else {
                        val frontHalfRows = (rows / 2)
                        if(userRow > frontHalfRows) 8 else 10
                    }

                income += ticketPrice
                println("Ticket price: $$ticketPrice")

                showMenu()
            }

        }
        3 -> {

            println("Number of purchased tickets: ${takenSeats.size}")

            println("total seat: $totalSeats")

            val percentage: Double = ((takenSeats.size.toDouble() / totalSeats.toDouble()) * 100.00)
            println("Percentage: ${"%.2f".format(percentage)}%")

            println("Current income: $$income")

            println("Total income: $$totalIncome")

            showMenu()
        }
    }
}

fun showMenu() {
    val scanner = Scanner(System.`in`)

    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")

    val userChoice = scanner.nextInt()
    executeUserChoice(userChoice)
}

fun calculateTotalIncome() {
    totalIncome =
        if (totalSeats < 60) {
            10 * totalSeats
        } else {
            val frontHalf = (rows / 2) * seats
            val backHalf = (rows - (rows / 2)) * seats
            (frontHalf * 10) + (backHalf * 8)
        }
}


fun main() {
    println("Enter the number of rows:")
    rows = scanner.nextInt()

    println("Enter the number of seats in each row:")
    seats = scanner.nextInt()

    totalSeats = rows*seats

    calculateTotalIncome()

    showMenu()
}

