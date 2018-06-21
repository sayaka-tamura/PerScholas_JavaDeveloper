package springwork.customAnnotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = EmailValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailConstraint {
	String message() default "Invalid email format";
	Class<?> [] groups() default {};
	Class<? extends Payload>[] payload() default{};
}


/*
 * @interface -> make it annotation
 * @target -> where put the class
 */
  