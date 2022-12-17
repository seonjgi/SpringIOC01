package ex12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		// admin1 ����ؼ� info1() ȣ���ϱ�
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		// admin1 ����ؼ� info2() ȣ���ϱ�
		ctx.getBean("adminInfo", AdminVO.class).info();
	}

}
