package com.mbahrami900913.mb_noteapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mbahrami900913.mb_noteapp.ui.theme.MB_NoteAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MB_NoteAppTheme(darkTheme = false) {

            }
        }
    }
}