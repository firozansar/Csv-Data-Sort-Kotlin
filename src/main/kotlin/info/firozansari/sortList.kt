package info.firozansari

fun sortList(sortNumber: Int, sortOrder: Int, sortList_before: MutableList<Student>){
	val sortInAscendingOrder = (sortOrder == 0)
	var fileName : String

	when(sortNumber){
		0 -> {
			if(sortInAscendingOrder){
				val sortedList = sortList_before.sortedBy{ it.number }
				fileName = "ascending.csv"
				csvFileWrite(fileName,sortedList)
			}else{
				val sortedList = sortList_before.sortedByDescending{ it.number }
				fileName = "descending.csv"
				csvFileWrite(fileName,sortedList)
			}
		}

		1 -> {
			if(sortInAscendingOrder){
				val sortedList = sortList_before.sortedBy{ it.course }
				fileName = "ascending.csv"
				csvFileWrite(fileName,sortedList)
			}else{
				val sortedList = sortList_before.sortedByDescending{ it.course }
				fileName = "descending.csv"
				csvFileWrite(fileName,sortedList)
			}
		}

		2 -> {
			if(sortInAscendingOrder){
				var sortedList = sortList_before.sortedBy{ it.age }
				fileName = "ascending.csv"
				csvFileWrite(fileName,sortedList)
			}else{
				var sortedList = sortList_before.sortedByDescending{ it.age }
				fileName = "descending.csv"
				csvFileWrite(fileName,sortedList)
			}
		}

		3 -> {
			if(sortInAscendingOrder){
				var sortedList = sortList_before.sortedBy{ it.score }
				fileName = "ascending.csv"
				csvFileWrite(fileName,sortedList)
			}else{
				var sortedList = sortList_before.sortedByDescending{ it.score }
				fileName = "descending.csv"
				csvFileWrite(fileName,sortedList)
			}
		}
		else -> {
			println("An unexpected error has occurred!")
		}
	}
}