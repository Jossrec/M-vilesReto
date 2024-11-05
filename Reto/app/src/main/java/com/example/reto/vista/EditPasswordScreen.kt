package com.example.reto.vista

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.reto.R
import com.example.reto.ui.theme.GreenAwaq

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditPasswordScreen(navController: NavController){
    CenterAlignedTopAppBar(
        title = {
            Text(
                "Contraseña",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = GreenAwaq,
            titleContentColor = com.example.reto.ui.theme.Black,
            scrolledContainerColor = GreenAwaq
        ),
        navigationIcon = {
            IconButton(onClick = { navController.navigate("ProfileScreen") }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Descripción del ícono"
                )
            }
        }

        )

    Column (
        Modifier
            .padding(start = 20.dp, end = 20.dp, top = 140.dp)
            .fillMaxSize()){

        Column {
            Text(
                text = "Contraseña actual",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                modifier = Modifier.padding(bottom = 20.dp)
            )
            Text(
                text = stringResource(R.string.contraseña),
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 5.dp)
            )
        }

        Divider()
        Spacer(modifier = Modifier.padding(10.dp))

        Column {
            Text(
                text = "Contraseña nueva",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                modifier = Modifier.padding(bottom = 20.dp)
            )
            Text(
                text = stringResource(R.string.newcontraseña),
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 5.dp)
            )
        }

        Divider()
        Spacer(modifier = Modifier.padding(10.dp))
        Column {
            Text(
                text = "Repetir contraseña nueva",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                modifier = Modifier.padding(bottom = 20.dp)
            )
            Text(
                text = stringResource(R.string.newcontraseña),
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 5.dp)
            )
        }

        Divider()
        Spacer(modifier = Modifier.padding(30.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ){
            Button(onClick = { navController.navigate("ProfileScreen") },
                modifier = Modifier.size(200.dp, 70.dp),

                colors = ButtonDefaults.buttonColors(
                    containerColor = GreenAwaq,  // Color de fondo
                    contentColor = White          // Color del texto
                )
            ) {
                Text("Confirmar", fontSize = 25.sp)
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showModifcont(modifier: Modifier = Modifier){
    val navController = rememberNavController()
    EditPasswordScreen(navController)

}