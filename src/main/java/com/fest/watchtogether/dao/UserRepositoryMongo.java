package com.fest.watchtogether.dao;

import com.fest.watchtogether.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepositoryMongo extends MongoRepository<User, Long> {
}
