package com.kraluk.docugen.document

import com.natpryce.hamkrest.assertion.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import java.nio.file.Paths
import java.util.*

object DocumentServiceSpec : Spek({
    val templateFile = "documents/sample_document.docx"

    given("a template document") {
        val templatePath = Paths.get(this.javaClass.classLoader.getResource(templateFile).toURI())
        val documentService = DocumentService(templatePath)

        on("load the given template") {
            val greeting = documentService.load()

            it("should be non nullified") {
                assertThat(greeting, Objects::nonNull)
            }
        }
    }
})