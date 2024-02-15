package com.example.doubletapptask

fun Int.pow(x: Int): Int {
    var result = 1
    repeat(x){
        result *= this
    }
    return result
}