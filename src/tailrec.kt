import java.math.BigInteger

/**
 * Created by Wenyang on 2018/3/22.
 */

class Result(var value: BigInteger =  BigInteger.valueOf(1L))

tailrec fun factorial(num: Int, result: Result){
    if(num != 0) {
        result.value = result.value.times(BigInteger.valueOf(num.toLong()))
        factorial(num - 1, result)
    }

}

fun main(args: Array<String>) {
    var result = Result()
    factorial(10000, result)
    print(result.value)
}
