lpackage com.amock.helloazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class HelloAzureApplication {

	Logger logger = LoggerFactory.getLogger(HelloAzureApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HelloAzureApplication.class, args);
	}

	@Controller
	class WebController {
		
		@GetMapping
		public String home(){
			logger.trace("A TRACE Message");
			logger.debug("A DEBUG Message");
			logger.info("An INFO Message");
			logger.warn("A WARN message");
			logger.error("An ERROR message");
			return "index";
		}
	}
}
