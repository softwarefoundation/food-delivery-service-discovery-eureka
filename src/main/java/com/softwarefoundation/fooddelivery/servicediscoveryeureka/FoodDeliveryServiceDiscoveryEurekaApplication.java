package com.softwarefoundation.fooddelivery.servicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FoodDeliveryServiceDiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryServiceDiscoveryEurekaApplication.class, args);
	}

}
