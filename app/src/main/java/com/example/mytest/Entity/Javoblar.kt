package com.example.mytest.Entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "Javoblar")

class Javoblar(
    @PrimaryKey(autoGenerate = true)
    var javoblarId: Int = 0,
    var javoblar: String,
)