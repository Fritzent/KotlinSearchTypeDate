fun main() {
    println("Type Min, Max, or Size to find the Magic")

    val stringText = InputUser()
    val resultText = SearchFunction()

    if (stringText.status == "Min" || stringText.status == "min") {
        resultText.searchIntMin()
        resultText.searchLongMin()
        resultText.searchFloatMin()
        resultText.searchDoubleMin()
        resultText.searchStringMin()

        println("Type yes for search again!")
        val next: String = readLine()!!

        if (next == "Yes" || next == "yes") {
            return main()
        } else {
            println("Thanks you")
        }
    } else if (stringText.status == "Max" || stringText.status == "max") {
        resultText.searchIntMax()
        resultText.searchLongMax()
        resultText.searchFloatMax()
        resultText.searchDoubleMax()
        resultText.searchStringMax()

        println("Type yes for search again!")
        val next: String = readLine()!!

        if (next == "Yes" || next == "yes") {
            return main()
        } else {
            println("Thanks you")
        }
    } else if (stringText.status == "Size" || stringText.status == "size") {
        resultText.searchIntSize()
        resultText.searchLongSize()
        resultText.searchFloatSize()
        resultText.searchDoubleSize()
        resultText.searchStringSize()

        println("Type yes for search again!")
        val next: String = readLine()!!

        if (next == "Yes" || next == "yes") {
            return main()
        } else {
            println("Thanks you")
        }
    } else {
        println(" ${stringText.status} is not valid, Please Input Again!")
        return main()
    }
}