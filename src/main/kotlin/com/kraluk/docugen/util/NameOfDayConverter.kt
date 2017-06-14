package com.kraluk.docugen.util

import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*

/**
 * Simple date to name of the day converter
 *
 * @author lukasz
 */
class NameOfDayConverter {

    companion object {
        private const val languageTag = "pl-PL"

        private val defaultLocale = Locale.forLanguageTag(languageTag)

        fun getNameOfDay(date: LocalDate): String {
            return date.dayOfWeek.getDisplayName(TextStyle.FULL, defaultLocale)
        }
    }
}