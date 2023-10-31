package com.ameda.address.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "addresses")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Address {
    @Id
    private String addressId;
    private String addressName;
    private String zipCode;
    private String county;
    private String Country;
}
