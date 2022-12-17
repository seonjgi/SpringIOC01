package ex08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//ConfigŬ������ ȯ�漳������ ����Ѵٴ� �ǹ��� ������̼�.
@Configuration
public class Config {

	// �������� �⺻������ ���� sigleton��ü(���ϰ�ü)�� �����Ѵ�
	// <bean id="e1" class="ex07.Emp"/> == @Bean(name="e1")
	@Bean(name = "e1")
	@Scope(value = "prototype")
	//@Scope(value = "singleton")  ==> ����Ʈ��
 	public Emp empInfo() {
		return new Emp("King", "Research", 5000);
	}

	// @Bean�� name�Ӽ��� ���� ������ ���� �̸��� �޼��� �̸��� ��name�� �ȴ�.
	// <bean id="empInfo2" class="ex07.Emp"/>
	@Bean
	public Emp empInfo2() {
		Emp e = this.empInfo();
		e.setName("Mil");
		e.setDept("Oper");
		e.setSalary(4000);
		return e;
	}
	
	//Emp���� ��ȯ�ϴ� �޼��带 �����ϼ���
	@Bean
	public Emp empInfo3() {
		return new Emp("Scott","Analyst",3000);
	}
	
	//ServiceImpl ���� ��ȯ�ϴ� �޼��带 �����ϼ���
	@Bean
	public ServiceImpl service() {
		ServiceImpl s = new ServiceImpl();
		s.setEmp(this.empInfo3());
		return s;
	}
}
