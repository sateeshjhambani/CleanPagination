package com.sateeshjh.cleanpagination

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sateeshjh.cleanpagination.ui.theme.CleanPaginationTheme

class MainActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanPaginationTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}