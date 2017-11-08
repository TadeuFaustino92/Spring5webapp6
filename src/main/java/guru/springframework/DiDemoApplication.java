package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication				// faz um component scan desse package para baixo: aula 58
// caso tivesse mudado o package "service" de lugar, a anottation: @ComponentScan faria o scan no local definido
// é preciso adicionar o "o guru.springframework", pois o basePackage sobreescreve o resto e só procura no package definido
// @ComponentScan(basePackages = {"guru.services", "guru.springframework"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);	// o run retorna o contexto de aplicação

		MyController controller = (MyController) ctx.getBean("myController");		// pedi ao contexto para me dar um bean chamado myController

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
