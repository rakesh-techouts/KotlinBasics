package techouts

fun main(args: Array<String>) {

    var stringList: List<String?> = listOf("Rakesh","Manoj", null, "ganesh")
    var newList = mutableListOf<String?>()
    for (item in stringList) {
        //item?.run { newList = newList.plus(this) } // working with reference
        item?.let { newList.add(it) } // works when it is not null
        item?.also{ println(it)}
    }
    println(newList)
}
