package fileio.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		// 클래스의 직렬화(현재의 상태를 그대로 저장)
		Person son = new Person("손정의","대표이사");
		Person son2 = new Person("나나나","이사");
		
		//보조 스트림-ObjextOutputStream
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)	
				){
			oos.writeObject(son);		
			oos.writeObject(son2);		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		//역직렬화 - 복원
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
				Person p1 = (Person)ois.readObject(); //객체읽기
				Person p2 = (Person)ois.readObject(); //객체읽기
				System.out.println(p1);
				System.out.println(p2);
		} catch (Exception e) {
		 e.printStackTrace();
		}
		
		
		
	}

}
