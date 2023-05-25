package com.example.mytest.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mytest.Entity.Fanlar
import com.example.mytest.Entity.Javoblar

@Dao

interface javoblarDao {
    @Insert
    fun addJavob(javoblar: Javoblar)

    @Query("select * from Javoblar where javoblarId = :id")
    fun getJavob(id: Int): Javoblar

    @Query("select * from Javoblar")
    fun getJavoblar(): List<Javoblar>

}