package com.example.CustomerService;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
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
