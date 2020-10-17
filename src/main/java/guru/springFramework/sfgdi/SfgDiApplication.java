package guru.springFramework.sfgdi;

import guru.springFramework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);
		
		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println(i18nController.seyHello());
		
		System.out.println("-------- Primary Bean");
		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println(myController.seyHello());
		
		System.out.println("-------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("-------- Setter");
		SetterInjectionController setterInjectionController = (SetterInjectionController) applicationContext.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());
		
		System.out.println("-------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
