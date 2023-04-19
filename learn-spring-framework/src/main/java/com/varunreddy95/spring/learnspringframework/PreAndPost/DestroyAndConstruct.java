package com.varunreddy95.spring.learnspringframework.PreAndPost;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.Arrays;

@Component
class SomeClass {
	
	private SomeDependency someDependency;
	
	@Autowired
	public SomeClass(SomeDependency someDependency) {
		super();
		System.out.println("All Dependencies are Ready");
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("Init ready");
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Clean up!");
	}
}

@Component
class SomeDependency {
	
}



@Configuration
@ComponentScan
public class DestroyAndConstruct {
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(DestroyAndConstruct.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		} catch (Exception e) {
			System.out.println(e);
		}
				
	}
}
