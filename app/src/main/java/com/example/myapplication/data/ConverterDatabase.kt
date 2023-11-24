package com.example.myapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ConversionResult::class],version = 1,exportSchema = false)
abstract class ConverterDatabase : RoomDatabase() {
    abstract val converterDAO : ConverterDAO
}
