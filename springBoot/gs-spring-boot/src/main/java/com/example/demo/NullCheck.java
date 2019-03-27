package com.example.demo;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

@Component
@Retention(RUNTIME)
@Target(ElementType.PARAMETER)
public @interface NullCheck {
}
