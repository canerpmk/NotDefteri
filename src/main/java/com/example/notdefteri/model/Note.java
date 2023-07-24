package com.example.notdefteri.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Note {
    @Id
    private UUID id;
    private String title;
    private String content;


}
