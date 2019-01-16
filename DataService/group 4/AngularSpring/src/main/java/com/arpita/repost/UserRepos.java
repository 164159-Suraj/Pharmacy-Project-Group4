package com.arpita.repost;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.arpita.model.User;

public interface UserRepos extends MongoRepository<User, String> {

}
