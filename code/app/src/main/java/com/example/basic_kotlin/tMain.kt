package com.example.basic_kotlin

fun main() {
    println("С использованием класса")
    usingClass()

    println("\n\nВывод с помощью итератора")
    iteratorPlusFunc()

    println("\n\nForEach колекции")
    arrayForEach()

    println("\n\nЦикл + When")
    loopPlusWhen()

    println("\n\nПростым while")
    justWhile()

    println("\n\nПростым for")
    justFor()
}

interface Gun {
    fun shoot()
}

class machineGun(private val bullets: IntRange) : Gun
{
    override fun shoot()
    {
        bullets.forEach {
            if (it %3 == 0)
                println("$it = Piff")
            if (it %5 == 0)
                println("$it = Paff")
        }
    }

    companion object MashineGunFactory {
        fun createGun(bullets: IntRange): machineGun = machineGun(bullets)
    }
}

fun usingClass()
{
    val myGun: Gun = machineGun.MashineGunFactory.createGun(0..100)
    myGun.shoot()
}

fun iteratorPlusFunc()
{
    val array = 0..100

    var iter = array.iterator()
    while (iter.hasNext())
    {
        printPaffAndPiff(iter.next())
    }
}

fun printPaffAndPiff(number: Int)
{
    if (number %3 == 0)
        println("$number = Piff")
    if (number %5 == 0)
        println("$number = Paff")
}

fun arrayForEach()
{
    val array = 0..100

    array.forEach {
        if (it %3 == 0)
            println("$it = Piff")
        if (it %5 == 0)
            println("$it = Paff")
    }
}

fun loopPlusWhen()
{
    for (i: Int in 0..100)
    {
        when
        {
            i %3 == 0 && i %5 == 0  -> {
                println("$i = Piff")
                println("$i = Paff")
            }
            i %3 == 0 -> println("$i = Piff")
            i %5 == 0 -> println("$i = Paff")
        }
    }
}

fun justWhile()
{
    var i: Int = -1
    while (++i <= 100)
    {
        if (i %3 == 0)
            println("$i = Piff")
        if (i %5 == 0)
            println("$i = Paff")
    }
}

fun justFor()
{
    for (i: Int in 0..100)
    {
        if (i %3 == 0)
            println("$i = Piff")
        if (i %5 == 0)
            println("$i = Paff")
    }
}