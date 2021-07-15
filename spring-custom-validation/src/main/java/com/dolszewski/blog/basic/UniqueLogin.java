package com.dolszewski.blog.basic;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueLoginValidator.class)
public @interface UniqueLogin {

//    String message() default "{com.dolszewski.blog.UniqueLogin.message}";
    String message() default "com.dolszewski.blxxxxxxxxxge";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
