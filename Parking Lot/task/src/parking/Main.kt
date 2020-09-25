package parking

import java.util.*
import java.lang.System

fun main() {
    /*println("White car has parked.\n" +
            "Yellow car left the parking lot.\n" +
            "Green car just parked here.")*/

    val scanner = Scanner(System.`in`)

    var carNumber: String = ""
    var carColor: String = ""
    var spotNumber: Int = 0

    var spot1state = false
    var spot2state = true

    val command = scanner.next()
    if (command == "park") {
        carNumber = scanner.next()
        carColor = scanner.next()

        if (spot1state) {
            println("$carColor car parked on the spot 1.")
            spot1state = false
        } else if (spot2state) {
            println("$carColor car parked on the spot 2.")
            spot2state = false
        } else {
            println("No free spots")
        }
    } else if (command == "leave") {
        spotNumber = scanner.nextInt()

        if (spotNumber == 1 && spot1state) {
            println("There is no car in the spot $spotNumber.")
        } else if (spotNumber == 2 && spot2state) {
            println("There is no car in the spot $spotNumber.")
        } else if (!spot1state) {
            println("Spot $spotNumber is free.")
            spot1state = true
        } else if (!spot2state) {
            println("Spot $spotNumber is free.")
            spot2state = true
        }
    } else println("Wrong command")
}
