package hellospringboot.jung.config;


import jakarta.annotation.Resource;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Conditional({MyCustomConditionalImpl.class})
public @interface MyCustomConditional {

    String value();
}
