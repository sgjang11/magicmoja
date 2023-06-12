package me.study;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // interface, class, enum 에만 붙을 수 있다.
@Retention(RetentionPolicy.SOURCE)
public @interface Magic {
}
