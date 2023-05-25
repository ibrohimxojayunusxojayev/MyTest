package com.example.mytest.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mytest.Entity.Fanlar
import com.example.mytest.Entity.Savollar

@Dao

interface savollarDao {
    @Insert
    fun addSavol(savollar: Savollar)

    @Query("select * from Savollar where id = :id")
    fun getSavol(id: Int): Savollar

}