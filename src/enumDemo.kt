/**
 * Created by Wenyang on 2018/3/16.
 */

enum class Lang(val hello: String){
    ENGLISH("Hello"),
    CHINESE("你好");

    companion object {
        fun parse(name: String): Lang{
            return Lang.valueOf(name.toUpperCase())
        }
    }

    fun sayHello(){
        println(hello)
    }
}

fun main(args: Array<String>) {
    if(args.size == 0) return
    var lang = Lang.parse(args[0])
    lang.sayHello()
    lang.sayBye()
}

fun Lang.sayBye(){
    val bye = when(this){
        Lang.ENGLISH -> "Bye"
        Lang.CHINESE -> "再见"
    }
    println(bye)
}