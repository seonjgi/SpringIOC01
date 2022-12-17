package ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/* ������ �����̳� : ���� �����Ѵ�.
 * 			     ������ �����̳ʴ� �� ��ü�� �����ϰ� ������, �� ��ü���� ���� ���踦 �������ش�.
                 BeanFactory�� ApplicationContext�� �����̳� ������ �����ϴ� �������̽�
 * 1 BeanFactory (�������̽�)
 * 2 ApplicationContext (BeanFactory �� ��ӹ��� ���� �������̽�.)
 * 3 WebApplicationContext (�������̽�. �� ���ø����̼��� ���� ApplicationContext��.
         �ϳ��� ������(��, �ϳ���ServletContext) ���� �� �� �̻��� WebApplicationContext�� ���� �� �ִ�).
 * 
 * DI(dependency Injection) : ������ ����
 * 1 ��ü ���� ���踦 �����ϰ� �����ϵ��� ���ִ� ��� ���� �ϳ�.
 * 2 �����Ǵ� ��ü�� ���������� �����ϴ� ��ü���� �������� �ʰ� 
 * �����̳ʿ��� ������ �ؼ� ����ϴ� ����̴�. 
 * - FileSystemXmlApplicationContext ==> xml�� ������
 * - ClassPathXmlApplicationContext ==> xml�� ������
 * - AnnotationConfigApplicationContext ==> �ڹٷ� ������
*/

public class HelloSpringApp {

	public static void main(String[] args) {
		// ������ �����̳� �����ؼ� mb1 ����� �� sayHello() ȣ���ϱ�
		String resource = "src/main/java/ex04/appContext.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(resource);

		Message msg = ctx.getBean("mb2", Message.class);
		msg.sayHello();
		msg.sayHi("BTS", "����ũ", "����", "�浿");
		msg.sayHi("�ϳ�");

	}

}
