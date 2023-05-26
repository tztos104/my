package downcasting;

import java.util.ArrayList;

class Animal{
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
}

//Human 클래스
class Human extends Animal{
	public void breathe() {
		System.out.println("사람이 숨을 쉽니다.");
	}
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
}

}
class 호랑이 extends Animal{
	public void breathe() {
		System.out.println("호랑이가 숨을 쉽니다.");
	}
	public void 사냥() {
		System.out.println("호랑이가 사냥을 합니다.");
	}}

class 독수리 extends Animal{
	public void breathe() {
		System.out.println("독수리가 숨을 쉽니다.");
	}
	public void 날다() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}}



public class AnimalTest{
	
	static ArrayList<Animal> animalList = new ArrayList<>();
	
	public static void main(String[] args) {
		//휴먼 객체를 생성
		//Animal human = new Human();
		
		//arraylist에 저장

		animalList.add(new Human());//0번
		animalList.add(new 호랑이());//1번
		animalList.add(new 독수리());//2번

		System.out.println("***타입 변환***");
		testCasting();
		
		/*
		Animal animal = new Human();
		animal.breathe();
		
		if(animal instanceof Human) {
			Human man = (Human)animal;
			man.read(); 
		}
	}*/
}//main 끝
	public static void testCasting() {
		for(int i= 0; i<animalList.size(); i++) {
			//다형성-부모 타입으로 객체 생성
			Animal animal = animalList.get(i);
			animal.breathe();
			
			if(animal instanceof Human) {
				Human human =(Human)animal;
				human.read();
			}else if(animal instanceof 호랑이) {
				호랑이 호랑이 =(호랑이)animal;
				호랑이.사냥();
				
			}else if(animal instanceof 독수리) {
				독수리 독수리 =(독수리)animal;
				독수리.날다();
				}else {
					System.out.println("지원하지 않습니다");
				}
	}}


}

	