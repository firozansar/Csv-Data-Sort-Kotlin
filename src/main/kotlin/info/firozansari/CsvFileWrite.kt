package info.firozansari

import java.io.File

fun csvFileWrite(fileName: String, sortedStudents: List<Student>) {
    var record: String
    printScreen(sortedStudents)

    File(fileName).bufferedWriter().use { out ->
        sortedStudents.forEach {
            record = it.number + ","
            record += it.name + ","
            record += it.course + ","
            record += it.age.toString() + ","
            record += it.score.toString() + ","
            out.write(record)
            out.newLine()
        }
    }
}

fun printScreen(sorted_studentList: List<Student>) {
    println("%3s%8s%20s%3s%3s".format("Number", "Name", "Class", "Age", "Score"))
    sorted_studentList.forEach {
        println("%-8s%-${25 - it.name.length}s%5s%6d%5d".format(it.number, it.name, it.course, it.age, it.score))
    }
}
