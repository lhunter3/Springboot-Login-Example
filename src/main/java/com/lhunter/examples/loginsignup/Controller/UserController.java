package com.lhunter.examples.loginsignup.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lhunter.examples.loginsignup.Data.User;
import com.lhunter.examples.loginsignup.Repository.UserRepository;


/*
 * 
 *  * *  * UserController * *  *
 * 
 * Our endpoints can be configured here
 * 
 * See documentation for for proper configuration of Request
 * 
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @CrossOrigin
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(@RequestBody String email, @RequestBody String password) {

        if(userRepository.findByEmailAndPassword(email, password) != null){
            return "welcome " + email;
        }

        return "login failed";

    }


    @CrossOrigin
    @RequestMapping(value="/users", method=RequestMethod.GET)
    public List<User> login() {
       return userRepository.findAll();
    }

    @CrossOrigin
    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public String signup(@RequestBody User newUser) {


        if(!userRepository.existsByEmail(newUser.getEmail())){
          
            userRepository.save(newUser);

            return "thanks for signing up " + newUser.getFirstName();
        }

        return "An account with that email already exists";
    }




    
}
