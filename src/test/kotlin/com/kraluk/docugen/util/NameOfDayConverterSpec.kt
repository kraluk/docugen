package com.kraluk.docugen.util

import com.natpryce.hamkrest.Matcher
import com.natpryce.hamkrest.assertion.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import java.time.LocalDate

object NameOfDayConverterSpec : Spek({

    given("a date") {
        val date = LocalDate.of(1990, 9, 9)

        on("translate to a name of the day") {
            val conversion = NameOfDayConverter.getNameOfDay(date)

            it("should be properly translated") {

                assert.that(conversion, Matcher(String::equals, "niedziela"))
            }
        }
    }
})