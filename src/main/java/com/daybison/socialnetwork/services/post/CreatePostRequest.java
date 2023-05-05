package com.daybison.socialnetwork.services.post;

import com.daybison.socialnetwork.entities.Comment;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class CreatePostRequest {
    private UUID id;
    private String userId;
    private String content;
    private List<String> likes;
    private List<Comment> comments;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
