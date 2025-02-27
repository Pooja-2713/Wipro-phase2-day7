package com.example.ProductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	// @Bean
	// public RestTemplate restTemplate(){
	// 	return new RestTemplate();
	// }
//	@Bean
//	public ChatModel chatModel(@Value("${spring.ai.openai.api-key}") String apiKey) {
//		return new OpenAiChatModel(new OpenAiApi(apiKey));
//	}
}
