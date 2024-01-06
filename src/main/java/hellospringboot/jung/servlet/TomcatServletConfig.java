package hellospringboot.jung.servlet;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name = "org.apache.catalina.startup.Tomcat")
//@ConditionalOnClass(value = Tomcat.class)
public class TomcatServletConfig {


    @Bean("tomcatWebServerFactory")
    public ServletWebServerFactory servletWebServerFactory() {


        return new TomcatServletWebServerFactory();
    }
}
