package ex1_1;
// 클래스 정의
class Npc {
	// 필드 - 데이터
	String name;
	int hp;
	// 메서드 - 동장
	void say() {
		System.out.println("안녕하세요.");
	}
	
}

public class MyNpc {

	public static void main(String[] args) {
		Npc saram1 = new Npc();
		// saram1 : 객체 변수
		saram1.name = "경비";
		saram1.hp = 100;
		System.out.println(saram1.name + ":" +
		                   saram1.hp);
		// 메서드 호출
		saram1.say();
		}	
	}

// class를 이용해 객체 생성
// Npc라는 클래스를 이용해 객체 생성