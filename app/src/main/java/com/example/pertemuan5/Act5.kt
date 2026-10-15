package com.example.pertemuan5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FormDataDiri(modifier: Modifier) {
    //variabel" untuk mengingat nilai masukan dari keyboard

    var textName by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textGender by remember { mutableStateOf(value = "") }
    val genderList: List<String> = listOf("Laki-Laki", "Perempuan")

    //variabel" untuk menyimpan data yang diperoleh dari komponen UI
    var name by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var gender by remember { mutableStateOf(value = "") }

    Column(modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {

        OutlinedTextField(
            value = textName,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = { Text("Nama Lengkap") },
            onValueChange = {
                textName = it
            }
        )

        Row {

            genderList.forEach { item->
                Row(modifier = Modifier.selectable(
                    selected = textGender == item,
                    onClick = {textGender = item}
                ), verticalAlignment = Alignment.CenterVertically) {

                }

            }
        }
    }

}




