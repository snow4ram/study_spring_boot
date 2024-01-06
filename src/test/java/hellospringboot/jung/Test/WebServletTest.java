package hellospringboot.jung.Test;

import hellospringboot.jung.servlet.JettyServletConfig;
import hellospringboot.jung.servlet.TomcatServletConfig;
import hellospringboot.jung.servlet.UndertowServletConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.*;

@Slf4j
public class WebServletTest {


    @Test
    @DisplayName("tomcat 서버 테스트 코드")
    public void tomcatServer() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();


        applicationContext.register(TomcatServletConfig.class);

        applicationContext.refresh();

        ServletWebServerFactory serverFactory = applicationContext.getBean("tomcatWebServerFactory", ServletWebServerFactory.class);

        log.info("서블릿 테스트 = {}", serverFactory.getClass().getName());

        log.info("서블릿 테스트 = {}", serverFactory.getWebServer().getPort());


        applicationContext.close();

    }



    @Test
    @DisplayName("jetty 서버 테스트 코드")
    public void jettyServer() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();


        applicationContext.register(JettyServletConfig.class);

        applicationContext.refresh();

        ServletWebServerFactory serverFactory = applicationContext.getBean("jettyWebServerFactory", ServletWebServerFactory.class);

        log.info("Servlet 테스트 = {}", serverFactory.getClass().getName());

        log.info(" Servlet port 테스트 = {}", serverFactory.getWebServer().getPort());


        applicationContext.close();

    }


    @Test
    @DisplayName("undertow 서버 테스트 코드")
    public void undertow() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();


        applicationContext.register(UndertowServletConfig.class);

        applicationContext.refresh();

        ServletWebServerFactory undertow = applicationContext.getBean("undertowWebServerFactory", ServletWebServerFactory.class);

        log.info("Undertow 테스트 = {}", undertow.getClass().getName());
        log.info("Undertow port 테스트 = {}", undertow.getWebServer().getPort());

    }


}
