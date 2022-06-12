package com.javatechie.api.service;

import com.javatechie.api.dto.UserRequest;
import com.javatechie.api.entity.User;
import com.javatechie.api.exception.UserNotFoundException;
import com.javatechie.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest){
    User user = User.build(0,userRequest.getName(),userRequest.getEmail(),userRequest.getMobile(),userRequest.getGender(),
            userRequest.getAge(),userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
     User user = userRepository.findByUserId(id);
             if(user != null){
                 return user;
             }else{
                 throw new UserNotFoundException("User Not found with Id :"+ id);
             }


    }
}
