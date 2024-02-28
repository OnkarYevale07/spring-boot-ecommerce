package com.ecommerce.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ecommerce.ecommerce.entity.User;
import com.ecommerce.ecommerce.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepo;

    @Override
    public User saveUser(User user) {
        user.setRole("ROLE_USER");
        User savedUser = userRepo.save(user);
        return savedUser;
    }

    @Override
    public User updateUser(User user) {
        User oldUser = userRepo.findById(user.getId()).get();
        oldUser.setFirstName(user.getFirstName());
        oldUser.setLastName(user.getLastName());
        oldUser.setEmail(user.getEmail());
        oldUser.setMobileNo(user.getMobileNo());
        return userRepo.save(oldUser);
    }

    @Override
    public User deleteUser(User user) {
        User oldUser = userRepo.findById(user.getId()).get();
        if(oldUser!=null){
            userRepo.delete(oldUser);
            return oldUser;
        }
        return user;
    }

    public User changePassword(int id,String password){
        User oldUser = userRepo.findById(id).get();
        oldUser.setPassword(password);
        return userRepo.save(oldUser);
    }

    public void removeSessionMessage(String msg){
        HttpSession session = ((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest().getSession();
        session.removeAttribute(msg);
    }

    @Override
    public User getUserById(int id) {
        User user = userRepo.findById(id).get();
        return user;
    }

    @Override
    public User findByEmail(String email) {
       User user = userRepo.findByEmail(email);
       if(user != null){
        return user;
       }else{
        return null;
       }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
