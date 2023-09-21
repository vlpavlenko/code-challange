package com.example.codechallenge.dto;

import com.example.codechallenge.model.PersonEntity;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CallListDto {
    public PersonEntity name;
    public String phone;
}

