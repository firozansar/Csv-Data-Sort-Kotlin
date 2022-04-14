package info.firozansari

import java.io.File
import java.util.StringTokenizer

import kotlin.system.exitProcess

fun csvFileOperation(sortNumber: Int, sortOrder: Int){
	val csvFile = getResourceText("UTF8Test.csv")
	val temporaryStudentList = mutableListOf<Student>()

	csvFile.forEachLine {
		if (it.isNotBlank()) {
			val tokenizer = StringTokenizer(it)
			val studentNumber = (tokenizer.nextToken(","))
			val studentName = (tokenizer.nextToken(","))
			val studentCourse = (tokenizer.nextToken(","))
			val studentAge = (tokenizer.nextToken(","))
			val studentScore = (tokenizer.nextToken(","))

			val hoge = Student(
					studentNumber,
					studentName,
					studentCourse,
					stringToInt(studentAge),
					stringToInt(studentScore)
			)
			temporaryStudentList.add(hoge)
		}
	}
	sortList(sortNumber, sortOrder, temporaryStudentList)
}

fun stringToInt(stringLikeInt : String):Int{
	val returnInt : Int

	when(stringLikeInt.toIntOrNull()){
		is Int -> 	{
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