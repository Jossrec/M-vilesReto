/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.reto.data

import android.net.Uri
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.Relation
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.reto.model.User

/**
 * Entity data class represents a single row in the database.
 */
//@Entity(tableName = "items")
//data class Item(
//    @PrimaryKey(autoGenerate = true)
//    val id: Int = 0,
//    val nombre: String,
//    val email: String,
//    val contraseña: String
//)
//
//data class Formulario(
//    @Embedded val formularioBase: Formulario_base,
//    @Relation(
//        parentColumn = "id",
//        entityColumn = "formId"
//    )
//    val ventanasB: Formulario_7
//    //val ventanasB: val ventanasB: Formulario_7
//)

class UriListConverter {

    @TypeConverter
    fun fromUriList(uriList: List<Uri>?): String? {
        return uriList?.joinToString(",") { it.toString() }
    }

    @TypeConverter
    fun toUriList(data: String?): List<Uri>? {
        return data?.split(",")?.map { Uri.parse(it) }
    }
}

@Entity(tableName = "formularios_base")
data class Formulario_base(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val email: String,
    val nombre: String,
    val fecha: String,
    val Localidad: String,
    val Hora: String,
    val Estado_del_Tiempo: String,
    val Época: String,
    val Tipo_Registro: String
)

@Entity(
    tableName = "formularios_1",
    foreignKeys = [
        ForeignKey(
            entity = Formulario_base::class,
            parentColumns = ["id"],
            childColumns = ["formId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["formId"])]  // Esto ayuda a optimizar las búsquedas por la clave foránea
)
data class Formulario_1(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val formId: Int,
    val numeroTransecto: String,
    val tipoAnimal: String,
    val nombreComun: String,
    val nombreCientifico: String,
    val numeroIndividuos: Int,
    val TipoObservacion: String,
    val Imagenes: List<Uri>,
    val observaciones: String
)

@Entity(
    tableName = "formularios_2",
    foreignKeys = [
        ForeignKey(
            entity = Formulario_base::class,
            parentColumns = ["id"],
            childColumns = ["formId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["formId"])]  // Esto ayuda a optimizar las búsquedas por la clave foránea
)

data class Formulario_2(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val formId: Int,
    val zona: String,
    val tipoAnimal: String,
    val nombreComun: String,
    val nombreCientifico: String,
    val numeroIndividuos: Int,
    val TipoObservacion: String,
    val AlturaObservacion: String,
    val Imagenes: List<Uri>,
    val observaciones: String
)

@Entity(
    tableName = "formularios_3",
    foreignKeys = [
        ForeignKey(
            entity = Formulario_base::class,
            parentColumns = ["id"],
            childColumns = ["formId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["formId"])]  // Esto ayuda a optimizar las búsquedas por la clave foránea
)

data class Formulario_3(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val formId: Int,
    val zona: String,
    val tipoAnimal: String,
    val nombreComun: String,
    val nombreCientifico: String,
    val numeroIndividuos: Int,
    val TipoObservacion: String,
    val AlturaObservacion: String,
    val Imagenes: List<Uri>,
    val observaciones: String
)

@Entity(
    tableName = "formularios_4",
    foreignKeys = [
        ForeignKey(
            entity = Formulario_base::class,
            parentColumns = ["id"],
            childColumns = ["formId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["formId"])]  // Esto ayuda a optimizar las búsquedas por la clave foránea
)

data class Formulario_4(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val formId: Int,
    val codigo: String,
    val Seguimiento: String,
    val Cambio: String,
    val Cobertura: String,
    val tipoCultivo: String,
    val Disturbio: String,
    val Imagenes: List<Uri>,
    val observaciones: String
)

@Entity(
    tableName = "formularios_5",
    foreignKeys = [
        ForeignKey(
            entity = Formulario_base::class,
            parentColumns = ["id"],
            childColumns = ["formId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["formId"])]  // Esto ayuda a optimizar las búsquedas por la clave foránea
)

data class Formulario_5(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val formId: Int,
    val codigo: String,
    val cuadrante: String,
    val subcuadrante: String,
    val habitoCrecimiento: String,
    val nombreComunEspecie: String,
    val nombreCientifico: String,
    val Placa: String,
    val Circunferencia: String,
    val Distancia: String,
    val estaturaBiomonitor: String,
    val Altura: String,
    val Imagenes: List<Uri>,
    val observaciones: String
)

@Entity(
    tableName = "formularios_6",
    foreignKeys = [
        ForeignKey(
            entity = Formulario_base::class,
            parentColumns = ["id"],
            childColumns = ["formId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["formId"])]  // Esto ayuda a optimizar las búsquedas por la clave foránea
)

data class Formulario_6(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val formId: Int,
    val codigo: String,
    val zona: String,
    val nombreCamara: String,
    val placaCamara: String,
    val placaGuaya: String,
    val anchoCamino: String,
    val fechaInstalacion: String,
    val distanciaObjetivo: String,
    val alturaLente: String,
    val programada: Boolean,
    val memoria: Boolean,
    val pruebaDeGateo: Boolean,
    val instalada: Boolean,
    val letreroDeCamara: Boolean,
    val prendida: Boolean,
    val Imagenes: List<Uri>,
    val observaciones: String
)


@Entity(
    tableName = "formularios_7",
    foreignKeys = [
        ForeignKey(
            entity = Formulario_base::class,
            parentColumns = ["id"],
            childColumns = ["formId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["formId"])]  // Esto ayuda a optimizar las búsquedas por la clave foránea
)

data class Formulario_7(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val formId: Int,
    val zona: String,
    val Pluviosidad: String,
    val Temperatura_maxima: String,
    val Humedad_maxima: String,
    val Temperatura_minima: String,
    val Humedad_minima: String,
    val Nivel_Quebrada: String
)
