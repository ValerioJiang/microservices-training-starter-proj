package com.training.customer.record;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
