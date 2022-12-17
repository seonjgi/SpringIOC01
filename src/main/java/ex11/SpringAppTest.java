package ex11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		// admin1 ����ؼ� info1() ȣ���ϱ�
		ApplicationContext ctx= new FileSystemXmlApplicationContext("src/main/java/ex11/appContext.xml");
		
		// admin1 ����ؼ� info2() ȣ���ϱ�
		ctx.getBean("admin1", AdminVO.class).info();
		ctx.getBean("admin2", AdminVO.class).info();
	}

}
