package com.crio.CoderHack.Service;

import com.crio.CoderHack.Entities.User;
import com.crio.CoderHack.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAllByOrderByScoreDesc();
    }

    @Override
    public User getUserById(String userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.orElse(null);
    }

    @Override
    public User registerUser(User user) {
        user.setScore(0);
        user.setBadges(new HashSet<>());
        return userRepository.save(user);
    }

    @Override
    public User updateScore(String userId, int score) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            user.setScore(score);
            updateBadges(user);
            return userRepository.save(user);
        }
        return null;
    }

    private void updateBadges(User user) {
        int score = user.getScore();
        Set<String> badges = user.getBadges();

        if(score >= 1 && score <= 30){
            badges.add("Code Ninja");
        }else if(score > 30 && score <= 60){
            badges.add("Code Champ");
        }else if(score > 60 && score <= 100){
            badges.add("Code Master");
        }
    }

    @Override
    public boolean deleteUser(String userId) {
        if(userRepository.existsById(userId)){
            userRepository.deleteById(userId);
            return true;
        }
        return false;
    }
}
