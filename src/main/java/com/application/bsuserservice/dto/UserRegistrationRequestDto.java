package com.application.bsuserservice.dto;

public record UserRegistrationRequestDto(
        String email,
        String password,
        String firstName,
        String lastName,
        String shippingAddress
) {
}
