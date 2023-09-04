package me.dio.sant.service;

import me.dio.sant.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
