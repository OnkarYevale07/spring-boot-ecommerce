package com.ecommerce.ecommerce.service;

import java.util.List;

import com.ecommerce.ecommerce.entity.User;

public interface UserService {
    
    public User saveUser(User user);

    public User updateUser(User user);

    public User deleteUser(User user);

    public User getUserById(int id);

    public User findByEmail(String email);

    public List<User> getAllUsers();

}
