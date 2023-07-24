package com.example.notdefteri.service;

import com.example.notdefteri.model.Note;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Service
@Builder
public class NoteService {
    private List<Note> noteList = new ArrayList<>();

    public Note getNoteById(UUID id) {
        for (Note note : noteList) {
            if (note.getId().equals(id)) {
                return note;
            }
        }
        return null;
    }

    public List<Note> getAllNotes() {
        return noteList;
    }

    public Note addNote(Note note) {

        note.setId(UUID.randomUUID());
        noteList.add(note);
        return note;
    }

    public Note updateNote(Note updatedNote) {
        for (Note note : noteList) {
            if (note.getId().equals(updatedNote.getId())) {
                note.setTitle(updatedNote.getTitle());
                note.setContent(updatedNote.getContent());
                return note;
            }
        }
        return null;
    }

    public boolean deleteNoteById(UUID id) {
        for (Note note : noteList) {
            if (note.getId().equals(id)) {
                noteList.remove(note);
                return true;
            }
        }
        return false;
    }
}
