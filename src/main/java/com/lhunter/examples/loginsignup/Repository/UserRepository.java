package com.lhunter.examples.loginsignup.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lhunter.examples.loginsignup.Data.User;

/*
 * 
 *  UserRepository
 * 
 * 
 */


public interface UserRepository extends JpaRepository<User, Long> {
    
    //Query for user Login
    User findByEmailAndPassword(String email, String password);

    //Query to see if account with email already exists
    boolean existsByEmail(String email);

    //More custom queries can be added. Follow Jpa naming conventions for or create custom queries using @Query(value="SQL QUERY HERE", nativeQuery=true) annotation

}
