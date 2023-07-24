package com.example.notdefteri.service;

import com.example.notdefteri.model.Note;
import com.example.notdefteri.repository.NoteRepository;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note getNoteById(UUID id) {
        return noteRepository.findById(id).orElse(null);
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note addNote(Note note) {
        note.setId(UUID.randomUUID());
        return noteRepository.save(note);
    }

    public Note updateNote(Note updatedNote) {
        if (noteRepository.existsById(updatedNote.getId())) {
            return noteRepository.save(updatedNote);
        }
        return null;
    }

    public boolean deleteNoteById(UUID id) {
        noteRepository.deleteById(id);
        return !noteRepository.existsById(id);
    }
}
