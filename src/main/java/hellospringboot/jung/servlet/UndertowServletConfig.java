package hellospringboot.jung.servlet;


import hellospringboot.jung.config.MyCustomConditional;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ConditionalOnClass(name = "io.undertow.Undertow")
public class UndertowServletConfig {

    @Bean("undertowWebServerFactory")
    @ConditionalOnMissingBean
    ServletWebServerFactory servletWebServerFactory() {
        UndertowServletWebServerFactory undertow = new UndertowServletWebServerFactory();


        //undertow.setContextPath("/test");

        return undertow;
    }
}
