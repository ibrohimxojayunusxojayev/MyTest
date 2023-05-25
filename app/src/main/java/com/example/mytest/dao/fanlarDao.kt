package com.example.mytest.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mytest.Entity.Fanlar

@Dao

interface fanlarDao {
    @Insert
    fun addFan(fanlar: Fanlar)

    @Query("select * from Fanlar where fanId = :id")
    fun getFan(id: Int):Fanlar

    @Query("select * from Fanlar")
    fun getFanlar():List<Fanlar>

}