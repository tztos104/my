package shelf;

public interface Queue {

	//자료구조 -선입선출 방식 (FIFO: first in dirst out)
	void enQueue(String title);//리스트 맨 마지막에 추가
	String deQueue(); //리스트의 맨 처음 항목 반환 90번 인덱스
	
	int getSize(); //현재 queue에 있는 개수 반환
}
