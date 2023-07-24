package com.example.notdefteri.repository;

import com.example.notdefteri.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.*;


@Repository
public interface NoteRepository extends JpaRepository<Note,UUID> {


}
