package com.example.todolist.data.ui.components

import android.graphics.Color
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import com.example.todolist.data.ui.theme.TodolistTheme

@Composable

fun DefaultCheckbox(
    modifier: Modifier = Modifier,
    label: String = "",
    isChecked: Boolean = false,
    onValueChange: (Boolean) -> Unit = {}
){
    
    val checkboxColor: Color by animateColorAsState
    (if (isChecked) MaterialTheme.colorScheme.primary
                 else MaterialTheme.colorScheme.background,
        
        label = ""
      )
    val density = LocalDensity.current
    val duration = 500
    val size = 22f
    val densityValue = 0.5
    
    TodolistTheme {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(dimensionResource(id = R.dimen.size_2)))
        ){
            
        }
    }
}