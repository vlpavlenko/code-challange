package com.example.codechallenge.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table(name = "contact")
@Entity
@Data
public class ContactEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "person_id", referencedColumnName = "id")
        private PersonEntity name;
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "address_id", referencedColumnName = "id")
        private AddressEntity address;

        @OneToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "contact_phone")
        @MapKeyColumn(name = "phone_id", nullable = false)
        private List<PhoneEntity> phone;
        private String email;
    }

