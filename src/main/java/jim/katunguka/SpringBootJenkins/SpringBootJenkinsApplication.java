package jim.katunguka.SpringBootJenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.proxy.Factory;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("application started");
	}


	public static void main(String[] args) {
		logger.info("application started");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);

	}

}
