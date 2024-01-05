package hellospringboot.jung.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

import java.util.Map;

public class MyCustomConditionalImpl implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(MyCustomConditional.class.getName());


        String value = (String) annotationAttributes.get("value");


        return ClassUtils.isPresent(value, context.getClassLoader());
    }
}
