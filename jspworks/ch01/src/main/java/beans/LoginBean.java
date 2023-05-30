package beans;

import java.io.Serializable;

public class LoginBean implements Serializable{

	
	private static final long serialVersionUID = 2L;
	
	//필드
	private String userid;
	private String passwd;
	
	//필드 값 설정
	private final String _userid = "today";
	private final String _passwd = "12345";
	
	//생성자
	public LoginBean() {}
	
	//로그인 체크
	public boolean checkUser() {
		if(userid.equals(_userid) && passwd.equals(_passwd)) {
			return true;
		}
		return false;
	}
	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	
	
}
