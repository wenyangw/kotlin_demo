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
    var name: Array<String>? = null
    //kotlin避免了空指针异常
    name?.size //表示name不为空时才执行
    name!!.size //表示name为空时会NPE，会出现异常

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