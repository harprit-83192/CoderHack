package com.crio.CoderHack.Service;

import com.crio.CoderHack.Entities.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(String userId);

    User registerUser(User user);

    User updateScore(String userId, int score);

    boolean deleteUser(String userId);

}
