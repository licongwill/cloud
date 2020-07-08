package cn.lic.cloud.configureserver;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ConfigurableApplicationContext;

@EnableConfigServer
@SpringBootApplication
public class ConfigureServerApplication {
	private static final Logger logger = LoggerFactory.getLogger(ConfigureServerApplication.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConfigureServerApplication.class, args);
		logger.info("context is {}",context);
	}

}
