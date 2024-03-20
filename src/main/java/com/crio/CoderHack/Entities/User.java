package com.crio.CoderHack.Entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Document(collection = "users")
public class User {
    @Id
    private String userId;
    private String username;
    private int score;
    private Set<String> badges;

    public User(){
        this.badges = new HashSet<>();
    }

    public User(String userId, String username, int score){
        this.userId = userId;
        this.username = username;
        this.score = score;
        this.badges = new HashSet<>();
    }
}
