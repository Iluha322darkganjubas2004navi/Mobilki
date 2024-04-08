package com.example.call

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputField = findViewById<EditText>(R.id.inputField)

        // Находим все кнопки с цифрами
        val buttons = listOf<Button>(
            findViewById(R.id.Point),
            findViewById(R.id.N0),
            findViewById(R.id.N1),
            findViewById(R.id.N2),
            findViewById(R.id.N3),
            findViewById(R.id.N4),
            findViewById(R.id.N5),
            findViewById(R.id.N6),
            findViewById(R.id.N7),
            findViewById(R.id.N8),
            findViewById(R.id.N9)
        )

        // Устанавливаем обработчик нажатия для каждой кнопки с цифрой
        buttons.forEach { button ->
            button.setOnClickListener {
                // Получаем текст кнопки (цифру)
                val digit = button.text.toString()
                // Добавляем цифру к тексту в EditText
                inputField.append(digit)
            }
        }
    }
}