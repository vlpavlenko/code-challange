package com.example.codechallenge.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "phone")
@Entity
@Data
public class PhoneEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
        private String number;
        private String type;
    }

