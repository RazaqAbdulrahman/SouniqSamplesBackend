package com.souniqsamples.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerEmail;
    private double amount;
    private LocalDateTime purchasedAt;

    @ManyToOne
    @JoinColumn(name = "sound_pack_id")
    private SoundPack soundPack;

    // Optional: store creator info at time of purchase
    private Long creatorId;

    // Getters & Setters
}

