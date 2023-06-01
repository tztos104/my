package objects;

public class Member {

		String id;
		Member(String id){
			this.id =id;			
		}
		@Override
		public int hashCode() {
			
			return id.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {//obj의 Book의 인스턴스 객체라면
				Member member = (Member)obj; //강제 형변환
				if(this.id.equals(member.id))
					return true; //true 반환
			
		} return false;
		
		}
		
		
		
		
}
