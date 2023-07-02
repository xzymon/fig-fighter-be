package com.xzymon.ngsf.figfighter;

import com.xzymon.ngsf.figfighter.controller.v1.TrainingPlanController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class FigFighterBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FigFighterBeApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping(TrainingPlanController.BASE_URL).allowedOrigins("http://localhost:4200");
			}
		};
	}

}
