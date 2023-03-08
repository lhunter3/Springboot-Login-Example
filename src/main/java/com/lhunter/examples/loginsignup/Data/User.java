package com.lhunter.examples.loginsignup.Data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


/*
 * 
 * * * * User Entity * * * 
 * 
 * Create Getters and Setters that are used to get/set data form db.
 * 
 * Ideally the database entities are never accessed directly and rather through another object (ex: UserData). 
 * This protects against various vulnerabilities while only returning the relevant information to the user.
 */

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    

    @Column @Getter @Setter
    private String firstName;
     
    @Column @Getter @Setter
    private String lastName;

    @Column @Getter @Setter
    private String genre;

    @Column @Getter @Setter
    private String email;

    //Would Ideally be encrypted, various solutions can be implemented
    @Column @Getter @Setter
    private String password;


}
