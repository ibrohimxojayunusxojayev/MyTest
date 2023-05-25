package com.example.mytest.Entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "Fanlar", foreignKeys = [
        ForeignKey(Savollar::class, ["id"], ["questionId"])
    ]
)

class Fanlar(
    @PrimaryKey(autoGenerate = true)
    var fanId: Int = 0,
    var fanName: String,
    var questionId: Int,
)



