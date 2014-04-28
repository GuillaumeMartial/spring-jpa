package fr.treeptik.runtime;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runtime {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
	}

}
