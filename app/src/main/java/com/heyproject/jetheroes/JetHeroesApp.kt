package com.heyproject.jetheroes

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.heyproject.jetheroes.ui.theme.JetHeroesTheme

/**
Written by Yayan Rahmat Wijaya on 11/8/2022 15:13
Github : https://github.com/yayanrw
 **/

@Composable
fun JetHeroesApp(
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {}
}

@Preview(showBackground = true)
@Composable
fun JetHeroesAppPreview() {
    JetHeroesTheme {
        JetHeroesApp()
    }
}