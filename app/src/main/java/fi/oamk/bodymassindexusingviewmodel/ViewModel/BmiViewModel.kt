package fi.oamk.bodymassindexusingviewmodel.ViewModel



import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class BmiViewModel : ViewModel() {

    var height by mutableStateOf("")
    var weight by mutableStateOf("")
    private var _bmi by mutableStateOf<Float?>(null) // Change to Float?

    val bmi: String
        get() = _bmi?.let { String.format("%.1f", it) } ?: ""

    fun calculateBmi() {
        val heightValue = height.toFloatOrNull()
        val weightValue = weight.toFloatOrNull()

        if (heightValue != null && weightValue != null && heightValue > 0) {
            _bmi = weightValue / (heightValue * heightValue) // Now correctly stores Float
        } else {
            _bmi = null
        }
    }
}
