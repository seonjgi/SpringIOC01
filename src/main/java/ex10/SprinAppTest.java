package ex10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SprinAppTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:ex10/application.xml");
		MessageBean mb=ctx.getBean("mb", MessageBean.class);
		mb.sayHello();
		mb.sayHi("¿µÈñ","Ã¶ÀÌ","¼øÈñ");

	}

}
