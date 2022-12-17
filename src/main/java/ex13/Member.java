package ex13;

import org.springframework.beans.factory.annotation.Value;

public class Member {
	
	@Value("김철수")
	private String name;
	
	@Value("KIM")
	private String useid;
	
	@Value("010-1111-2222")
	private String tel;
	
	public void showInfo() {
		System.out.printf("이름:%s%n아이디:%s%n연락처:%s%n", this.getName(), this.getUseid(), this.getTel());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUseid() {
		return useid;
	}
	public void setUseid(String useid) {
		this.useid = useid;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
