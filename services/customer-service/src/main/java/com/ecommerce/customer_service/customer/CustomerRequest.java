package com.ecommerce.customer_service.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

public record CustomerRequest(
        String id,
        @NotNull(message="Customer firstname is required")
        String firstName,
        @NotNull(message="Customer lastname is required")
        String lastName,
        @NotNull(message="Customer email is required")
        @Email(message = "Customer email is not a valid email address")
        String email,
        @NotNull(message="Customer address is required")
        Address address
) {

}
