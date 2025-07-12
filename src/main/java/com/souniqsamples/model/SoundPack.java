package com.souniqsamples.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SoundPack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String previewUrl;
    private String cloudinaryUrl;
    private double price;
    private boolean isFree;

    private LocalDateTime uploadedAt;

    @ManyToOne
    @JoinColumn(name = "creator_id")
    private User creator;

    @Enumerated(EnumType.STRING)
    private LicenseType licenseType;

    // Getters & Setters
}

