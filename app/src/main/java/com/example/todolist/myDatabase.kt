package com.example.todolist

import androidx.room.Database
import androidx.room.RoomDatabase

//roomDatabase

@Database(entities = [Entity::class], version = 1)
abstract class myDatabase :RoomDatabase(){

    abstract fun dao():DAO

}