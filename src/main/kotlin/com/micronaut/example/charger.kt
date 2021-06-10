package com.micronaut.example

import javax.inject.Singleton

@Singleton
class charger {
    fun chargeMyPhone(phType:String): String{
        return "charging $phType"
    }
}