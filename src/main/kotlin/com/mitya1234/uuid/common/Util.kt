package com.mitya1234.uuid.common

import java.util.UUID

private fun calcControlNumber(uuid: UUID):Int {
    val str = uuid.toString().replace("-", "")
    val ints = str.toCharArray().map { Integer.parseInt(it.toString(),16) }
    var sum = 0
    var counter = 1
    for (num in ints) {
        sum += num * counter
        counter++
        if (counter > 10) counter = 1
    }
    return sum % 16
}


private fun getLastHex(uuid: UUID):String {
    return "%x".format(calcControlNumber(uuid))
}

fun getFull(uuid: UUID):String {
    return "$uuid-${getLastHex(uuid)}"
}