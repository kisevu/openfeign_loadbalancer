package com.ameda.address.controller;

import com.ameda.address.DTO.AddressRequest;
import com.ameda.address.entity.Address;
import com.ameda.address.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
public class AddressController {
    private final AddressService addressService;
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody AddressRequest addressRequest){
        Address address = addressService.create(addressRequest);
        return new ResponseEntity<>(address,HttpStatus.CREATED);
    }
    @GetMapping("/address/{addressId}")
    public ResponseEntity<?> addressById(@PathVariable("addressId") String addressId){
        Address address = addressService.addressById(addressId);
        return new ResponseEntity<>(address,HttpStatus.OK);
    }
}
