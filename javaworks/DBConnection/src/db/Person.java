package db;
//vo(value object
public class Person {

		private String userId;
		private String userpw;
		private String name;
		private int age;
		//기본생성자
		public Person() {}
		
		//외부 입력 가능한 생성자
		public Person(String userId, String userpw,
						String name, int age) {
			this.userId = userId;
			this.userpw = userpw;
			this.name = name;
			this.age =age;

		}
		
		//setter,getter
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserpw() {
			return userpw;
		}
		public void setUserpw(String userpw) {
			this.userpw = userpw;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	
}
