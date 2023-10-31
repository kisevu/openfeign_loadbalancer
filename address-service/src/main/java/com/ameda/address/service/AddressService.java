package com.ameda.address.service;

import com.ameda.address.DTO.AddressRequest;
import com.ameda.address.entity.Address;
import com.ameda.address.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class AddressService {
    private final AddressRepository addressRepository;
    public String setId(){
        return UUID.randomUUID().toString()
                .replace("-", "")
                .substring(0, 12);
    }
    public Address create(AddressRequest addressRequest) {
        Address address = Address.builder()
                .addressId(setId())
                .addressName(addressRequest.getAddressName())
                .zipCode(addressRequest.getZipCode())
                .county(addressRequest.getCounty())
                .Country(addressRequest.getCountry())
                .build();
        addressRepository.save(address);
        return address;
    }
    public Address addressById(String addressId) {
        return addressRepository.findById(addressId).orElseThrow();
    }
}
