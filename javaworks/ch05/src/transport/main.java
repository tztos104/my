package transport;

public class main {

	public static void main(String[] args) {
		//사람객체 생성
		Person p1 =new Person("조혜원", 10000);
		Person p2 =new Person("안민상", 10000);
		Person p3 =new Person("오카카", 20000);
		
		//버스 객체 생성
		Bus bus740 = new Bus("740");
		Bus bus750 = new Bus("750");
		
		Texi kakatexi = new Texi("kakatexi");
		
		
		p1.take(bus740, 1300);
		p1.take(bus740, 1000);
		p3.take(kakatexi, 4800);
		p1.showInfo();
		p2.showInfo();
		bus740.showInfo();
		bus750.showInfo();
		kakatexi.showInfo();

	}

}
