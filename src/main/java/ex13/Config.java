package ex13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Config {
	@Bean(name="emp1")
	public Emp getBean() {
		return new Emp("������","�빫��",4500);
	}
	
	@Bean(name="emp2")
	public Emp getBean2() {
		return new Emp("�浿ȫ","�λ��",9800);
	}
	
	@Bean
	public Member member() {
		return new Member();
	}
	
	@Bean
	public ServiceImpl service() {
		return new ServiceImpl();
	}
	
}
