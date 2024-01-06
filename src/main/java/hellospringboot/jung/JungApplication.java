package hellospringboot.jung;



import hellospringboot.jung.servlet.PropertiesApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(PropertiesApplicationRunner.class)
public class JungApplication {

	public static void main(String[] args) {
		SpringApplication.run(JungApplication.class, args);
	}

}
