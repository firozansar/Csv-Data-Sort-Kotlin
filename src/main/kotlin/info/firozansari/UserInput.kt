package info.firozansari

import kotlin.system.exitProcess

fun inputNumber(sort: Int): Int {
    val input = readLine()
    val output: Int

    when (input?.toIntOrNull()) {
        is Int -> {
            output = input.toInt()
            checkNumber(sort, output)
            return output
        }
        else -> {
            println("The input information is invalid!")
            exitProcess(0)
        }
    }
}

fun checkNumber(sort: Int, checkNumber: Int) {
    if (checkNumber < 0 || sort < checkNumber) {
        println("The input information is invalid!")
        exitProcess(0)
    }
}