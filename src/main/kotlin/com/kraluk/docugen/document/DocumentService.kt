package com.kraluk.docugen.document

import mu.KotlinLogging
import org.docx4j.openpackaging.io3.Load3
import org.docx4j.openpackaging.io3.stores.ZipPartStore
import org.docx4j.openpackaging.packages.OpcPackage
import java.nio.file.Path

/**
 * TODO: please, comment me!
 *
 * @author lukasz
 */
class DocumentService(private val templatePath: Path) {

    companion object {
        private val log = KotlinLogging.logger {}
    }

    private var opcPackage: OpcPackage? = null

    fun load(): OpcPackage {
        log.debug { "Attempting to load document '${templatePath.fileName}'..." }

        val partLoader = ZipPartStore(templatePath.toFile())
        val loader = Load3(partLoader)
        val document = loader.get()

        log.debug { "Loaded given document successfully." }

        opcPackage = document

        return document
    }
}