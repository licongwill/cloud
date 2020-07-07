package cn.lic.cloud.configureclient;

import cn.lic.cloud.configureclient.listeners.MyApplicationContextListeners;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigureClientApplication {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ConfigureClientApplication.class);
		application.addListeners(new MyApplicationContextListeners());
		ConfigurableApplicationContext context = application.run(args);

	}

}
