package ex05;

public class FriendTest {

	public static void main(String[] args) {
		
		Friend[] friends = new Friend[5];
		
		friends[0] = new Friend("홍길동", "1111", "test@test.com");
		friends[1] = new Friend("김길동", "2222", "test@test.com");
		friends[2] = new Friend("이길동", "3333", "test@test.com");
		friends[3] = new Friend("안길동", "5555", "test@test.com");
		friends[4] = new Friend("박길동", "4444", "test@test.com");
		
		System.out.println("이름\t전화번호\t메일주소");
		for(int i=0; i<friends.length; i++)
		System.out.println( friends[i].getInfo() )	;
	}

}
