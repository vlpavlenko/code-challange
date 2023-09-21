package com.example.codechallenge.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "name")
@Entity
@Data
public class PersonEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
        private String first;
        private String middle;
        private String last;
    }

