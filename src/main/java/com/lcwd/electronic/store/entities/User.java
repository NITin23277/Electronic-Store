package com.lcwd.electronic.store.entities;

import jakarta.persistence.*;
import lombok.*;

import lombok.Builder;
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Builder
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column(name = "user_name")
    private String name;
    @Column(name = "user_eamil" , unique = true)
    private String email ;
    @Column(name ="user_password" , length = 10)
    private String password;

    private String gender ;
    @Column(length = 1000)
    private String about ;

    @Column(name = "user_image_name")
    private String imageNae ;




}
