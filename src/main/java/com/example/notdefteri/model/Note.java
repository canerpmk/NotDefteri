package com.example.notdefteri.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Note {
    private UUID id;
    private String title;
    private String content;


    public Note(UUID id, String title, String content) {
        this.id=id;
        this.title = title;
        this.content = content;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String toString() {
        return "Notes [id=" + id + ", title=" + title + ", content=" + content +  "]";
    }
}
