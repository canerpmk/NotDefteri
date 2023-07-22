package com.example.notdefteri.repository;

import com.example.notdefteri.model.Notes;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Repository;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class NoteRepository {

    private Map<String, Notes> noteMap = new HashMap<>();

    public Notes findById(String id) {
        return noteMap.get(id);
    }

    public List<Notes> findAll() {
        return new ArrayList<>(noteMap.values());
    }

    public Notes save(Notes note) {
        noteMap.put(note.getId(), note);
        return note;
    }

    public boolean deleteById(String id) {
        return noteMap.remove(id) != null;
    }
}
