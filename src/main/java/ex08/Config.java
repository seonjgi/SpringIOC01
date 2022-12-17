package ex08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//Config클래스를 환경설정으로 사용한다는 의미의 어노테이션.
@Configuration
public class Config {

	// 스프링은 기본적으로 빈을 sigleton객체(단일객체)로 생성한다
	// <bean id="e1" class="ex07.Emp"/> == @Bean(name="e1")
	@Bean(name = "e1")
	@Scope(value = "prototype")
	//@Scope(value = "singleton")  ==> 디폴트값
 	public Emp empInfo() {
		return new Emp("King", "Research", 5000);
	}

	// @Bean에 name속성을 주지 않으면 빈의 이름은 메서드 이름이 빈name이 된다.
	// <bean id="empInfo2" class="ex07.Emp"/>
	@Bean
	public Emp empInfo2() {
		Emp e = this.empInfo();
		e.setName("Mil");
		e.setDept("Oper");
		e.setSalary(4000);
		return e;
	}
	
	//Emp빈을 반환하는 메서드를 구성하세요
	@Bean
	public Emp empInfo3() {
		return new Emp("Scott","Analyst",3000);
	}
	
	//ServiceImpl 빈을 반환하는 메서드를 구성하세요
	@Bean
	public ServiceImpl service() {
		ServiceImpl s = new ServiceImpl();
		s.setEmp(this.empInfo3());
		return s;
	}
}
