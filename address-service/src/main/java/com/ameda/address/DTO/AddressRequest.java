package com.ameda.address.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AddressRequest {
    private String addressName;
    private String zipCode;
    private String county;
    private String Country;
}
