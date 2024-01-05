package hellospringboot.jung.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MyCustomConditional(value = "org.apache.catalina.startup.Tomcat")
public class AppConfig {


    @Bean("tomcatWebServerFactory")
    public ServletWebServerFactory servletWebServerFactory() {
        TomcatServletWebServerFactory serverFactory = new TomcatServletWebServerFactory();

        serverFactory.setPort(8081);
        return serverFactory;
    }
}
