package com.example.notdefteri.controller;

import com.example.notdefteri.model.Notes;
import com.example.notdefteri.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteService noteService;
    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }
    @GetMapping
    public List<Notes> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notes> getNoteById(@PathVariable UUID id) {
        Notes note = noteService.getNoteById(id);
        if (note != null) {
            return ResponseEntity.ok(note);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Notes> createNote(@RequestBody Notes note) {
        Notes createdNote = noteService.addNote(note);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdNote);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Notes> updateNote(@PathVariable UUID id, @RequestBody Notes updatedNote) {
        updatedNote.setId(String.valueOf(id));
        Notes updatedNoteResult = noteService.updateNote(updatedNote);
        if (updatedNoteResult != null) {
            return ResponseEntity.ok(updatedNoteResult);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNote(@PathVariable String id) {
        boolean isDeleted = noteService.deleteNoteById(id);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
