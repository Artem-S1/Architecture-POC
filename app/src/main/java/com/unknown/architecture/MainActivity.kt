package com.unknown.architecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import com.unknown.core_ui.buttons.CustomTextButton
import com.unknown.core_ui.theme.CoreUITheme
import com.unknown.payment.PaymentFeatureModule
import kotlinx.coroutines.launch

// TODO just an example
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val useCase = PaymentFeatureModule.provideUseCase()

        setContent {
            CoreUITheme {
                Column(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CustomTextButton(text = "Pay button",
                        onClick = {
                            lifecycleScope.launch {
                                val result = useCase.onPayFine()
                                println(result)
                            }
                        })
                }
            }
        }
    }
}