package com.example.notdefteri.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Data
public class Notes {
    private String id;
    private String title;
    private String content;


    public Notes(String id, String title, String content) {
        this.id=id;
        this.title = title;
        this.content = content;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
