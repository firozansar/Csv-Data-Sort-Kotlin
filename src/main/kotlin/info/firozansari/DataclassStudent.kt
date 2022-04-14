package info.firozansari

data class Student(
    val number: String = "",
    val name: String = "",
    val course: String = "",
    val age: Int = 0,
    val score: Int = 0
) {
    override fun toString(): String {
        return "$number,$name,$course,$age,$score"
    }
}