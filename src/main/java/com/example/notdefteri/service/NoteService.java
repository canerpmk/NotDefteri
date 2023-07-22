package com.example.notdefteri.service;

import com.example.notdefteri.model.Notes;
import com.example.notdefteri.repository.NoteRepository;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Service
@Builder
public class NoteService {
    private List<Notes> noteList = new ArrayList<>();
    public Notes getNoteById(UUID id) {
        for (Notes note : noteList) {
            if (note.getId().equals(id)) {
                return note;
            }
        }
        return null;
    }

    public List<Notes> getAllNotes() {
        return noteList;
    }

    public Notes addNote(Notes note) {
        String randomId = UUID.randomUUID().toString();
        note.setId(randomId);
        noteList.add(note);
        return note;
    }

    public Notes updateNote(Notes updatedNote) {
        for (Notes note : noteList) {
            if (note.getId().equals(updatedNote.getId())) {
                note.setTitle(updatedNote.getTitle());
                note.setContent(updatedNote.getContent());
                return note;
            }
        }
        return null;
    }

    public boolean deleteNoteById(String id) {
        for (Notes note : noteList) {
            if (note.getId().equals(id)) {
                noteList.remove(note);
                return true;
            }
        }
        return false;
    }
}
