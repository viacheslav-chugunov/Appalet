package viacheslav.chugunov.core.model.ui

import viacheslav.chugunov.core.model.domain.Theme
import viacheslav.chugunov.core.util.Screen

interface MainState {
    val theme: Theme
    val modeDay: Boolean
    val preview: Screen.Preview
    val openScreen: Screen?

    object Empty : MainState {
        override val theme: Theme = Theme.Empty
        override val modeDay: Boolean = true
        override val preview: Screen.Preview = Screen.Login
        override val openScreen: Screen? = null
    }
}