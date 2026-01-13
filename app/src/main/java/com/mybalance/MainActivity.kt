package com.mybalance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mybalance.ui.HomeScreen
import com.mybalance.ui.theme.MyBalanceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBalanceTheme {
                HomeScreen()
            }
        }
    }
}
