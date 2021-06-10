package com.micronaut.example

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class phone(@Inject private val charger: charger) {
    fun providePhone( s:String): String
    {
         val r=charger.chargeMyPhone(s)
          return "$r check"
    }
}