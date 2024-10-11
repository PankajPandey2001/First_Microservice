package com.microservice.service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication


// FIRST STEP ---------------------
// to make it service registry WE WILL HAVE TO ADD ANNOTATION
@EnableEurekaServer   // now this will be serve as service registry ; but before that
// we need to add SPECIFY IN WHICH PORT THIS WILL RUN ------------
// and also need to configure that this application is a server and it should not try to
// connect itself




public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
