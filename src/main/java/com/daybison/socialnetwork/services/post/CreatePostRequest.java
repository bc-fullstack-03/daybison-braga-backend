package com.daybison.socialnetwork.services.post;

import lombok.Data;

@Data
public class CreatePostRequest {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
