package com.example.pertemuan5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

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


}




