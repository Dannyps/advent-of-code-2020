import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {
    val inputStream: InputStream = File("advc1.txt").inputStream()
    val numbers = mutableListOf<Int>()

    inputStream.bufferedReader().useLines { lines -> lines.forEach { numbers.add(it.toInt())} }

    for (i in 0 until numbers.size){
        for (j in i+1 until numbers.size){
            for (k in j+1 until numbers.size){
                if(numbers[i] + numbers[j] + numbers[k] == 2020){
                    print(numbers[i]*numbers[j]*numbers[k])
                    return
                }
            }
        }
    }
}
