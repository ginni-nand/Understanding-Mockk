package com.micronaut.example

import javax.inject.Inject

class work(@Inject private  val ph: phone) {

    fun check()
    {
        print(ph.providePhone("abc"))
    }
}