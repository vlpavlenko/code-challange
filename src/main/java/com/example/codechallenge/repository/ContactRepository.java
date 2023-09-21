package com.example.codechallenge.repository;

import com.example.codechallenge.model.ContactEntity;
import com.example.codechallenge.model.PhoneEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.Join;
import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {
    @Query("SELECT c FROM ContactEntity c JOIN c.phone p WHERE p.type = ?1 ORDER BY c.name.last DESC, c.name.first DESC")
    public List<ContactEntity> findAllByPhoneType(String keyword);
}
