package com.souniqsamples.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role; // ADMIN, CREATOR, CUSTOMER

    private String bio;

    @OneToMany(mappedBy = "creator", cascade = CascadeType.ALL)
    private List<SoundPack> soundPacks;

    // Getters & Setters
}


