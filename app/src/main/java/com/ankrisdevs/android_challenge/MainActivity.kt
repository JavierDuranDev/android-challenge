package com.ankrisdevs.android_challenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ankrisdevs.android_challenge.presentation.core.navigation.NavigationWrapper
import com.ankrisdevs.android_challenge.ui.theme.AndroidchallengeTheme
import dagger.hilt.android.AndroidEntryPoint

// AndroidEntryPoint --> Se pone en todas las activities que tengan inyección de dependencias
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidchallengeTheme {
                NavigationWrapper()
            }
        }
    }
}