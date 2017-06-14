package com.kraluk.docugen.model

import com.kraluk.docugen.util.NameOfDayConverter
import java.time.LocalDate
import java.time.LocalTime

/**
 * Activity data class
 *
 * @author lukasz
 */
data class Activity(val id: Int, val date: LocalDate, val time: LocalTime, val pedagogue: String) {

    val dayName: String
        get() = NameOfDayConverter.getNameOfDay(date)
}