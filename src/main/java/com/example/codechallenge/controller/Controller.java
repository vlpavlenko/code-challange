package com.example.codechallenge.controller;

import com.example.codechallenge.dto.CallListDto;
import com.example.codechallenge.exception.handler.ContactNotFoundException;
import com.example.codechallenge.model.ContactEntity;
import com.example.codechallenge.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contacts")
    public List<ContactEntity> all() {
        return contactRepository.findAll();
    }

    @GetMapping("/contacts/{id}")
    public ContactEntity one(@PathVariable Long id) throws ContactNotFoundException {
        return contactRepository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException(id));
    }

    @PostMapping("/contacts")
    public ContactEntity newContact(@RequestBody ContactEntity newContact) {
        return contactRepository.save(newContact);
    }

    @PutMapping("/contacts/{id}")
    public ContactEntity replaceContact(@RequestBody ContactEntity newContact, @PathVariable Long id) {

        return contactRepository.findById(id)
                .map(contact -> {
                    contact.setName(newContact.getName());
                    contact.setAddress(newContact.getAddress());
                    contact.setPhone(newContact.getPhone());
                    contact.setEmail(newContact.getEmail());
                    return contactRepository.save(contact);
                })
                .orElseGet(() -> {
                    newContact.setId(id);
                    return contactRepository.save(newContact);
                });
    }

    @DeleteMapping("/contacts/{id}")
    void deleteContact(@PathVariable Long id) {
        contactRepository.deleteById(id);
    }

    @GetMapping("/contacts/call-list")
    public List<CallListDto> callList() {
        List<ContactEntity> results = contactRepository.findAllByPhoneType("home");
        List<CallListDto> callList = new ArrayList<>();
        for (ContactEntity contact : results) {
            callList.add(CallListDto.builder().name(contact.getName())
                    .phone(contact.getPhone().stream()
                            .filter(phoneEntity -> phoneEntity.getType()
                                    .equals("home")).findFirst().get().getNumber()).build());
        }
        return callList;
    }
}
