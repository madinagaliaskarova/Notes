package com.example.notes.data.repository

import com.example.notes.data.localdb.NoteDao
import com.example.notes.data.mapper.toEntity
import com.example.notes.data.mapper.toNote
import com.example.notes.data.model.NoteEntity
import com.example.notes.domain.model.Note
import com.example.notes.domain.repository.NoteRepository
import javax.inject.Inject


class NoteRepositoryImpl @Inject constructor(
    private val noteDao : NoteDao
): NoteRepository {
    override fun createNote(note: Note) {
        noteDao.createNote(note.toEntity())
    }

    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map { it.toNote() }
    }

    override fun editNote(note: Note) {
        noteDao.editNote(note.toEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toEntity())
    }
    }


