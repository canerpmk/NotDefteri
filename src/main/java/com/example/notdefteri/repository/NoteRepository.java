package com.example.notdefteri.repository;

import com.example.notdefteri.model.Note;
import org.springframework.stereotype.Repository;


import java.util.*;


@Repository
public class NoteRepository {


    private Map<UUID, Note> noteMap = new HashMap<>();

    public Note findById(UUID id) {
        return noteMap.get(id);
    }

    public List<Note> findAll() {
        return new ArrayList<>(noteMap.values());
    }

    public Note save(Note note) {
        noteMap.put(note.getId(), note);
        return note;
    }

    public boolean deleteById(UUID id) {
        return noteMap.remove(id) != null;
    }
}
