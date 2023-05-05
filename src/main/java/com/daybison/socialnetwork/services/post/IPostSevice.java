package com.daybison.socialnetwork.services.post;

import com.daybison.socialnetwork.entities.Comment;
import com.daybison.socialnetwork.entities.Post;

import java.util.List;

public interface IPostSevice {

    Post createPost(CreatePostRequest request);
    List<FindPostResponse> getAllPosts();
    FindPostResponse getPostById(String id);
    FindPostResponse addComment(String postId, Comment comment);
    FindPostResponse addLike(String postId, String userId);
}
