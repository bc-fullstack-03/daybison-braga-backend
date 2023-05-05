package com.daybison.socialnetwork.api;

import com.daybison.socialnetwork.entities.Comment;
import com.daybison.socialnetwork.entities.Post;
import com.daybison.socialnetwork.services.post.CreatePostRequest;
import com.daybison.socialnetwork.services.post.FindPostResponse;
import com.daybison.socialnetwork.services.post.IPostSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @Autowired
    private IPostSevice _postService;

    public PostController(IPostSevice _postService) {
        this._postService = _postService;
    }

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody CreatePostRequest request) {
        Post post = _postService.createPost(request);
        return ResponseEntity.ok(post);
    }

    @GetMapping
    public ResponseEntity<List<FindPostResponse>> getAllPosts() {
        List<FindPostResponse> responseList = _postService.getAllPosts();
        return ResponseEntity.ok().body(responseList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FindPostResponse> getPostById(@PathVariable String id) {
        FindPostResponse response = _postService.getPostById(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/{postId}/comments")
    public ResponseEntity<FindPostResponse> addComment(@PathVariable String postId, @RequestBody Comment comment) {
        FindPostResponse response = _postService.addComment(postId, comment);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/{postId}/likes/{userId}")
    public ResponseEntity<FindPostResponse> addLike(@PathVariable String postId, @PathVariable String userId) {
        FindPostResponse response = _postService.addLike(postId, userId);
        return ResponseEntity.ok(response);
    }
}
