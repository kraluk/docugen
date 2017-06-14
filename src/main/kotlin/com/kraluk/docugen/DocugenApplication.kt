package com.kraluk.docugen

import com.kraluk.docugen.view.RootView
import javafx.application.Application
import tornadofx.App

/**
 * Main Application class
 *
 * @author lukasz
 */
class DocugenApplication {

    companion object {

        @JvmStatic fun main(args: Array<String>) {
            Application.launch(DocugenJfxApp::class.java, *args)
        }
    }

    class DocugenJfxApp : App() {
        override val primaryView = RootView::class
    }
}
