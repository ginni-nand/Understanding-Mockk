package com.micronaut.example

import io.micronaut.test.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject
import javax.validation.constraints.AssertTrue

@MicronautTest
class phoneTest(
    ){
    val chargermockk = mockk<charger>()
    val ph=phone(chargermockk)
    @Test
    fun test() {
      every { chargermockk.chargeMyPhone("abc") } returns "charging Iphone"
           val response=ph.providePhone("abc")
        Assertions.assertEquals(response,"charging abc check")
    }
}