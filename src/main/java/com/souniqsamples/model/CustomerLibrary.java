package com.souniqsamples.model;

import jakarta.persistence.*;

@Entity
public class CustomerLibrary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerEmail;

    @ManyToOne
    private SoundPack soundPack;

    // Timestamps, downloadCount, etc. can be added here

    // Getters & Setters
}
