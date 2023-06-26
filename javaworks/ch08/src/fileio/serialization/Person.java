package fileio.serialization;

import java.io.Serializable;

//클래스의 직렬화 (현재의 상태를 그대로 저장)
public class Person implements Serializable  {

	private static final long serialVersionUID = 10L;

	//필드
	String name;
	String jop;
	
	public Person(String name, String jop) {
		this.name = name;
		this.jop = jop;
	}

	@Override
	public String toString() {
		return name + ", " + jop;
	}
	
}
