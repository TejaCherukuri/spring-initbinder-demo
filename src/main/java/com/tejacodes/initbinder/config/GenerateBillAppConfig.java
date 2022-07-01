package com.tejacodes.initbinder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.tejacodes.initbinder.converter.CreditCardObjectToStringConverter;
import com.tejacodes.initbinder.converter.CreditCardStringToObjectConverter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.tejacodes.initbinder")
public class GenerateBillAppConfig implements WebMvcConfigurer {
	
		// Configuring View Resolver in Java
		@Bean
		public InternalResourceViewResolver viewResolver()
		{
			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
			viewResolver.setPrefix("/WEB-INF/view/");
			viewResolver.setSuffix(".jsp");
			
			return viewResolver;
		}
		
		/* Commenting because this can also be defined using InitBinder.
		 * 
		@Override
		public void addFormatters(FormatterRegistry registry) {
			CreditCardFormatter creditCardFormatter = new CreditCardFormatter();
			registry.addFormatter(creditCardFormatter);
		}
		*/
		
		// Converter need two classes to do two-way data binding unlike Formatter/PropertyEditor
		@Override
		public void addFormatters(FormatterRegistry registry) {
			registry.addConverter(new CreditCardObjectToStringConverter());
			registry.addConverter(new CreditCardStringToObjectConverter());
		}
}
