package com.example.notdefteri.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Note {

    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private String content;


}
