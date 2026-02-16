package com.edureka.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * API Gateway Application
 * 
 * This service acts as the single entry point for all client requests
 * and routes them to the appropriate microservices.
 * 
 * Features:
 * - Service Discovery integration with Eureka
 * - Dynamic routing based on service registry
 * - Load balancing across multiple service instances
 * - CORS configuration for cross-origin requests
 * - Swagger/OpenAPI documentation aggregation
 * - Distributed tracing with Zipkin
 * - Health checks and monitoring with Actuator
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
