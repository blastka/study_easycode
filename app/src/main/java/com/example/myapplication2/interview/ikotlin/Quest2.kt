package com.example.myapplication2.interview.ikotlin

// Дана строка с произвольными символами. Нужно вернуть длину самого большого палиндрома, который можно составить из ее символов.
// Палиндром - это слово которое одинаково читается с начала и с конца, например "шалаш" или "потоп".
// Пример:
// Input: aaabbbccccdd
// Output: 11 (палиндром dccbaaabccd)

//шалашкошка
//кшалашк
//шкалакш

// a -> 3
// b -> 3
// c -> 4
// d -> 2

// O(n)

fun main() {


}

fun polindrom(str: String): Int {
    val map = mutableMapOf<Char, Int>()
    str.forEach{ char->
        if(map.containsKey(char)) {
            map[char] = map[char]!! + 1
        } else{
            map[char] = 1
        }
    }
    var count = 0
    var odd = false
    map.values.forEach { value->
        if(value % 2 == 0) {
            count += value
        } else {
            count += value - 1
            odd = true
        }
    }
    if(odd) {
        count += 1
    }
    return count
}