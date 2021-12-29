package ru.sakaev.web.application.validation;

import ru.sakaev.web.application.annotations.PasswordMatches;
import ru.sakaev.web.application.payload.request.SignupRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidater implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches passwordMatches) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        SignupRequest  userSignupRequest = (SignupRequest) o;

        return userSignupRequest.getPassword().equals(userSignupRequest.getConfirmPassword());
    }
}
