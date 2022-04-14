package info.firozansari

import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import java.io.File
import java.util.StringTokenizer

import kotlin.system.exitProcess

fun csvFileOperation(sortNumber: Int, sortOrder: Int) {
    val temporaryStudentList = mutableListOf<Student>()
    val csvFile = getResourceText("UTF8Test.csv")
    val rows: List<List<String>> = csvReader().readAll(csvFile)
    rows.forEach { row: List<String> ->
        println(row)
    }
//	csvReader().open("UTF8Test.csv") {
//		readAllAsSequence().forEach { row: List<String> ->
//			//Do something
//			println(row) //[a, b, c]
//		}
//	}

//	csvFile.forEachLine {
//		if (it.isNotBlank()) {
//			val tokenizer = StringTokenizer(it)
//			val studentNumber = (tokenizer.nextToken(","))
//			val studentName = (tokenizer.nextToken(","))
//			val studentCourse = (tokenizer.nextToken(","))
//			val studentAge = (tokenizer.nextToken(","))
//			val studentScore = (tokenizer.nextToken(","))
//
//			val hoge = Student(
//					studentNumber,
//					studentName,
//					studentCourse,
//					stringToInt(studentAge),
//					stringToInt(studentScore)
//			)
//			temporaryStudentList.add(hoge)
//		}
//	}
//	sortList(sortNumber, sortOrder, temporaryStudentList)
}

fun stringToInt(stringLikeInt: String): Int {
    val returnInt: Int

    when (stringLikeInt.toIntOrNull()) {
        is Int -> {
            returnInt = stringLikeInt.toInt()
            return returnInt
        }
        else -> {
            println("Done")
            exitProcess(0)
        }
    }
}

fun getResourceText(path: String): String {
    return File(ClassLoader.getSystemResource(path).file).readText()
}