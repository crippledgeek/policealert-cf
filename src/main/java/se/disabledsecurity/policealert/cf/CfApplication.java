package se.disabledsecurity.policealert.cf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CfApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfApplication.class, args);
	}

}
