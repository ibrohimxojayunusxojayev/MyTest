package com.example.mytest.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mytest.Entity.Fanlar
import com.example.mytest.Entity.Javoblar
import com.example.mytest.Entity.Savollar
import com.example.mytest.dao.fanlarDao
import com.example.mytest.dao.javoblarDao
import com.example.mytest.dao.savollarDao

@Database(entities = [Fanlar::class, Savollar::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun getFanlarDao(): fanlarDao
    abstract fun getSavollarDao(): savollarDao
    abstract fun getJavoblarDao(): javoblarDao

    companion object {
        private var instance: AppDataBase? = null
        fun getInstance(context: Context): AppDataBase {
            if (instance == null) {
                instance = Room.databaseBuilder(context, AppDataBase::class.java, "app_db")
                    .allowMainThreadQueries().build()
                if (instance!!.getFanlarDao().getFanlar().isEmpty()) {
                    initDB()
                }
            }
            return instance!!
        }

        private fun initDB() {
            instance!!.getJavoblarDao().addJavob(Javoblar(javoblar = "198"))
            instance!!.getJavoblarDao().addJavob(Javoblar(javoblar = "Fizik"))
            instance!!.getJavoblarDao().addJavob(Javoblar(javoblar = "5"))

            instance!!.getSavollarDao().addSavol(Savollar(savol = "2 * 99 = ?", javob = 1, variant1 = "123", variant2 = "45", variant3 = "198"))
            instance!!.getSavollarDao().addSavol(Savollar(savol = "Newton kim?", javob = 2, variant1 = "Adabiyotshunos olim", variant2 = "kosmonavt", variant3 = "Fizik"))
            instance!!.getSavollarDao().addSavol(Savollar(savol = "7 - 2 = ?", javob = 3, variant1 = "3", variant2 = "5", variant3 = "8"))

            instance!!.getFanlarDao().addFan(Fanlar(fanName = "Matematika", questionId = 1))
            instance!!.getFanlarDao().addFan(Fanlar(fanName = "Fizika", questionId = 2))
            instance!!.getFanlarDao().addFan(Fanlar(fanName = "Matematika", questionId = 3))

        }
    }
}