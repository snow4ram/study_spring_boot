package hellospringboot.jung.servlet;


import hellospringboot.jung.config.MyCustomConditional;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MyCustomConditional(value = "io.undertow.Undertow")
public class UndertowServletConfig {

    @Bean("undertowWebServerFactory")
    ServletWebServerFactory servletWebServerFactory() {
        return new UndertowServletWebServerFactory();
    }
}
