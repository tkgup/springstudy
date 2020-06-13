package site.tkgup.pojo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		UserAction userAction = ctx.getBean(UserAction.class);
		userAction.execute();
	}
	
}
