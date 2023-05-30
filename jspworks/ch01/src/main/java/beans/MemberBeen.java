package beans;

import java.io.Serializable;

//인터페이스 Serializable(직렬화 - 현재 객체 자체를 저장)
public class MemberBeen implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id =2023101;
	private String name = "장그래";
	
	public  MemberBeen(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
