package springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Object bean = context.getBean(SuperMarket.class);
		System.out.println(bean);
		System.out.println("*****************************************************");
		VaccinationCenter center = context.getBean(VaccinationCenter.class);
		System.out.println(center);
	}
}
