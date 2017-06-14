package com.kraluk.docugen

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.jetbrains.spek.api.dsl.xgiven

object DocugenApplicationSpec : Spek({

    xgiven("an application") {
        val application = DocugenApplication()

        on("greeting") {
            
            it("should return a non blank greeting") {

            }
        }
    }
})
