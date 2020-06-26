import java.util.*
import kotlin.math.min

fun main() {
    println("Type True or False use Magic")
//    var status:String = readLine()!!

    val stringText = inputUser()
    val resultText = searchFunction()

    if(stringText.status == "true"){
        resultText.searchIntMin()
        resultText.searchLongMin()
        resultText.searchFloatMin()
        resultText.searchDoubleMin()
        resultText.searchStringMin()
    }else if (stringText.status == "false") {
        resultText.searchIntMax()
        resultText.searchLongMax()
        resultText.searchFloatMax()
        resultText.searchDoubleMax()
        resultText.searchStringMax()
    }else {
        resultText.searchIntSize()
        resultText.searchLongSize()
        resultText.searchFloatSize()
        resultText.searchOtherSize()
    }
}