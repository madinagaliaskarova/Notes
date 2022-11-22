package com.example.notes.di

import com.example.notes.data.localdb.NoteDao
import dagger.Component
import dagger.Module
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@Singleton

abstract class DataModule {

//fun NoteDao(appDataBase:AppDataBase) : NoteDao{
//return appDataBase.noteDao()
//}

}