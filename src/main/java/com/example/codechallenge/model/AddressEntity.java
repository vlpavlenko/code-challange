package com.example.codechallenge.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "address")
@Entity
@Data
public class AddressEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
        private String street;
        private String city;
        private String state;
        private String zip;
    }

