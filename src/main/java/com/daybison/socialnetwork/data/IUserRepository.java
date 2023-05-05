package com.daybison.socialnetwork.data;

import com.daybison.socialnetwork.entities.User;
import com.daybison.socialnetwork.services.user.CreateUserRequest;
import com.daybison.socialnetwork.services.user.FindUserResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.UUID;

public interface IUserRepository extends MongoRepository<User, UUID> {
   Optional<User> findUserByEmail(String email);
   boolean existsUserByEmail(String email);

}
