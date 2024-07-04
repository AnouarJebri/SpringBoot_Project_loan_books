package com.esprit.springbootapp.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "refresh_tokens")
public class RefreshToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String token;

    @Column(name = "expiry_date", nullable = false)
    private Timestamp expiryDate;

    // Constructors, getters, and setters

    public RefreshToken() {
    }

// Getters and setters for all fields
// Omitted for brevity
}