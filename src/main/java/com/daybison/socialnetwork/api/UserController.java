package com.daybison.socialnetwork.api;


import com.daybison.socialnetwork.services.user.CreateUserRequest;
import com.daybison.socialnetwork.services.user.FindUserResponse;
import com.daybison.socialnetwork.services.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private IUserService _userService;

    @PostMapping()
    public ResponseEntity<String> createUser(@RequestBody CreateUserRequest request){

        var response = _userService.createUser(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }

    @GetMapping
    public ResponseEntity<FindUserResponse> getUser(String email){
        return ResponseEntity.ok().body(_userService.findUserByEmail(email));
    }
}
