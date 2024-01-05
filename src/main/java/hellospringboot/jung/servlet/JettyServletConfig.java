package hellospringboot.jung.servlet;

import hellospringboot.jung.config.MyCustomConditional;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MyCustomConditional(value = "org.eclipse.jetty.server.Server")
public class JettyServletConfig{

    @Bean("jettyWebServerFactory")
    public ServletWebServerFactory servletWebServerFactory() {
        return new JettyServletWebServerFactory();
    }
}
