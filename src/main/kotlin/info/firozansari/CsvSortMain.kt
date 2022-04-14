package info.firozansari

/**
 *  A program that sorts and outputs CSV files
 *
 * Requirements
 * 1. Read the CSV file and sort according to the method entered by the user.
 * 2. Display the sort result on the screen and output it in CSV file format.
 */
fun main(args: Array<String>) {
    //Show startup options.
    if (args.size == 1) option(args[0])

    // The user chooses the sort method.
    // The part that accepts user input is in input.
    // Return with Int Null checked.
    println("Please select the item you want to sort")
    print("[0: Number 1: Name 2: Age 3: Score] ＞")
    val sortNumber = inputNumber(3)

    println("Please select a sort type")
    print("[0: Ascending order 1: Descending order] ＞")
    val sortOrder = inputNumber(1)

    // CSV file operations and data operations are performed in this function.
    csvFileOperation(sortNumber, sortOrder)
}
