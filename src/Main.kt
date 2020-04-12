// https://www.hackerrank.com/challenges/strange-code/problem

fun strangeCounter(t: Long): Long {
    var startTime = 1.toLong()
    var itemCount = 3.toLong()

    while (t !in startTime until startTime + itemCount) {
        startTime += itemCount
        itemCount *= 2
    }

    return itemCount - (t - startTime)
}

fun main() {
    println(strangeCounter(4))
}