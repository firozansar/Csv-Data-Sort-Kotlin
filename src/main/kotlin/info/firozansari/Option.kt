package info.firozansari

import kotlin.system.exitProcess

fun option(option_item : String){
	when(option_item){
		"-help" -> {
			println("The application sorts the information in the CSV format file based on the input key and displays the result.")
		}
		else -> {
			println("This is an option that does not exist")
			exitProcess(0)
		}
	}
}