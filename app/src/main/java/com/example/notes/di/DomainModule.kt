package com.example.notes.di

import com.example.notes.data.repository.NoteRepositoryImpl
import com.example.notes.domain.repository.NoteRepository
import dagger.Binds
import dagger.Module

@Module

abstract class DomainModule {

    @Binds
    abstract fun noteRepository(noteRepositoryImpl: NoteRepositoryImpl): NoteRepository



}