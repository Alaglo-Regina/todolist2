package com.example.todolist.data.views.layout

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.savedstate.SavedStateRegistryController


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun BackAppBar(navController: NavController){
    MaterialTheme{
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.background),
            title = { }
        )
    }

}