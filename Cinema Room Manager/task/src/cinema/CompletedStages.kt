package cinema

//private fun showCinema(rows: Int, seats: Int, userRow: Int = -1, userSeat: Int = -1) {
//    println("Cinema:")
//    for (i in 1..rows + 1) {
//
//        for (j in 1..seats + 1) {
//            if (i == userRow + 1 && j == userSeat + 1) {
//                print(" B")
//            } else if (i == 1) {
//                if (j == 1) print(" ") else print(" " + (j - 1))
//            } else {
//                if (j == 1) print(i - 1) else print(" S")
//            }
//        }
//
//        println()
//    }
//}

//Stage 1
//    println("Cinema:")
//    for (i in 1..8) {
//
//        for (j in 1..9) {
//            if (i == 1){
//                if (j==1) print(" ") else print(" " + (j-1))
//            }
//            else {
//                if (j==1) print(i-1) else print(" S")
//            }
//        }
//
//        println()
//    }

//stage 2
//    val scanner = Scanner(System.`in`)
//
//    println("Enter the number of rows:")
//    val rows = scanner.nextInt()
//
//    println("Enter the number of seats in each row:")
//    val seats = scanner.nextInt()
//
//    val totalSeats = rows*seats
//
//    val income =
//        if (totalSeats < 60) {
//            10 * totalSeats
//        } else {
//            val frontHalf = (rows / 2) * seats
//            val backHalf = (rows - (rows / 2)) * seats
//            (frontHalf * 10) + (backHalf * 8)
//        }
//
//    println("Total Income:")
//    println("$$income")

//stage 3
//        val scanner = Scanner(System.`in`)
//
//        println("Enter the number of rows:")
//        val rows = scanner.nextInt()
//
//        println("Enter the number of seats in each row:")
//        val seats = scanner.nextInt()
//
//        showCinema(rows, seats)
//
//        println("Enter a row number:")
//        val userRow = scanner.nextInt()
//
//        println("Enter a seat number in that row:")
//        val userSeat = scanner.nextInt()
//
//        val totalSeats = rows*seats
//
//        val ticketPrice =
//            if (totalSeats < 60) {
//                10
//            } else {
//                val frontHalfRows = (rows / 2)
//                if(userRow > frontHalfRows) 8 else 10
//            }
//
//        println("Ticket price: $$ticketPrice")
//
//        showCinema(rows, seats, userRow, userSeat)