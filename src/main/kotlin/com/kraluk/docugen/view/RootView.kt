package com.kraluk.docugen.view

import com.kraluk.docugen.model.Activity
import javafx.collections.FXCollections
import tornadofx.SmartResize
import tornadofx.View
import tornadofx.column
import tornadofx.tableview
import java.time.LocalDate
import java.time.LocalTime

/**
 * Application Main View
 *
 * @author lukasz
 */
class RootView : View() {

    private val persons = FXCollections.observableArrayList(
            Activity(1, LocalDate.of(1981, 12, 4), LocalTime.now(), "Mr. A"),
            Activity(2, LocalDate.of(1982, 12, 4), LocalTime.now(), "Mr. B"),
            Activity(3, LocalDate.of(1983, 12, 4), LocalTime.now(), "Mr. C"),
            Activity(4, LocalDate.of(1984, 12, 4), LocalTime.now(), "Mr. D")
    )

    override val root = tableview(persons) {
        column("ID", Activity::id)
        column("Date", Activity::date)
        column("Name of the day", Activity::dayName)
        column("Time", Activity::time)
        column("Pedagogue", Activity::pedagogue)

        columnResizePolicy = SmartResize.POLICY
    }
}