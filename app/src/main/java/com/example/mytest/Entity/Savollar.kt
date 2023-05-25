package com.example.mytest.Entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "Savollar",  foreignKeys = [
    ForeignKey(Javoblar::class, ["javoblarId"], ["javob"])
])

class Savollar(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var savol: String,
    var variant1: String,
    var variant2: String,
    var variant3: String,
    var javob: Int,

)



