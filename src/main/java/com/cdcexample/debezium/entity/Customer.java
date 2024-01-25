package com.cdcexample.debezium.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
public class Customer {
    @Id  @JsonProperty("ID")
    private Long id;
    @JsonProperty("FULLNAME")
    private String fullname;
    @JsonProperty("EMAIL")
    private String email;
}
