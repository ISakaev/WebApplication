package ru.sakaev.web.application.annotations;

import ru.sakaev.web.application.validation.EmailValidator;
import ru.sakaev.web.application.validation.PasswordMatchesValidater;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidater.class)
@Documented
public @interface PasswordMatches {

    String message() default "Password do not match";

    Class<?>[] groups() default{};

    Class<? extends Payload>[] payload() default {};
}
