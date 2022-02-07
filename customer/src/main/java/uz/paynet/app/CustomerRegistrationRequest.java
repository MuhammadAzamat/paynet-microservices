package uz.paynet.app;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
