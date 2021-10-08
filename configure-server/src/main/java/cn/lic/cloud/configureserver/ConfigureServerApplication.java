package cn.lic.cloud.configureserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigureServerApplication {
	private static final Logger logger = LoggerFactory.getLogger(ConfigureServerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ConfigureServerApplication.class, args);
	}

}
