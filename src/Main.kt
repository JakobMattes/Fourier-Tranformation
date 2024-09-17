//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var bool1 = true
    var input = ""
    var inputAsFloat: Float = 0f
    var noAnswersArray = arrayOf("N", "n", "No", "no", "Nein", "nein", "Non", "non", "Nuh uh", "nuh uh")
    var inputList = mutableListOf<Float>()

    fun isConvertibleToFloat(input: String): Boolean {
        return input.toFloatOrNull() != null
    }




    while (bool1 == true) {
        println("Einen Wert hinzufügen?")
        input = readln()
        if (input in noAnswersArray) {
            bool1 = false
        }
        else {
            if (isConvertibleToFloat(input) == true) {
                inputAsFloat = inputAsFloat.toFloat()
            } else {
                println("Ich habe dich leider nicht verstanden. Kannst du es bitte noch einmal versuchen?")
            }
        }


    }

    println(inputList)

}
