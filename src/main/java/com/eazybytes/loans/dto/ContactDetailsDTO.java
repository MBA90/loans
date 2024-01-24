package com.eazybytes.loans.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "loans")
@Setter
@Getter
public class ContactDetailsDTO {

    private String name;

    private String email;
}
