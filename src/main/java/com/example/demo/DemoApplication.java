package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.game.BatMan;
import com.example.demo.game.GaminConfiguration;
import com.example.demo.game.Mario;
import com.example.demo.lazy.LazyConfiguration;
import com.example.demo.postpreconstruct.PPCConfiguration;
import com.example.demo.postpreconstruct.PPDemoClass;
import com.example.demo.postpreconstruct.PPDependencyClass;
import com.example.demo.scopes.NormalClass;
import com.example.demo.scopes.PrototypeClass;
import com.example.demo.scopes.ScopeConfiguration;
import com.example.demo.service.data.BusinessCalculationService;
import com.example.demo.service.data.DataService;
import com.example.demo.service.data.DataServiceConfiguration;
import com.example.demo.game.GamingConsole;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GaminConfiguration.class)){
			//use @Qualifier("BatManQualifier") before getBean parameter if you want to specify wich class spring will construct
			System.out.println(context.getBean(GamingConsole.class));
		}
		try(
			var context = new AnnotationConfigApplicationContext(DataServiceConfiguration.class)
		){
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
		//Lazy Initialization
		try(
			var context = new AnnotationConfigApplicationContext(LazyConfiguration.class)
		){
			//If we don't write anything here the beans under com.example.demo.lazy will be initialized until we specify @Lazy annotaion
			//By default Spring is eager we want it to be lazy
			//However eager init is always recommended (Errors can be discovered at app startup)
		}
		//Scopes
		try(
			var context = new AnnotationConfigApplicationContext(ScopeConfiguration.class)
		){
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			//From the three lines above We get one object instance per Spring IOC container.
			///So its Spring Singleton


			//From the three lines below we get three objects instances per Spring IOC container
			///Not Singleton 
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}

		try(
			var context = new AnnotationConfigApplicationContext(PPCConfiguration.class)
		){
			System.out.println(context.getBean(PPDemoClass.class));
			System.out.println(context.getBean(PPDependencyClass.class));
			//Without using @PostConstruct or @PreDestroy we get this 
			/* 
				All dependencies are ready!
				com.example.demo.postpreconstruct.PPDemoClass@50313382
				com.example.demo.postpreconstruct.PPDependencyClass@1cb346ea 
			*/
		}


		//SpringApplication.run(DemoApplication.class, args);
	}

}
