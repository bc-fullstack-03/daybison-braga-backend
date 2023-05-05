package com.daybison.socialnetwork.data;

import com.daybison.socialnetwork.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPostRepository extends MongoRepository<Post, String> {
}
