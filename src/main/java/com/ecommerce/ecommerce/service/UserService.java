package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.entity.User;

public interface UserService {
    
    public User saveUser(User user);

    public User updateUser(User user);

    public User deleteUser(User user);

    public User getUserById(int id);

}
