
public class Hero {
//문10
	String name;
	int hp;
	static int sec;

	



	public void sit(int sec) {
		this.hp = hp + sec;
		System.out.println(name + "는" + sec + "초에 앉았다.");
		System.out.println(hp+"가"+sec+"포인트 추가");
	}
	
	
	public static void main(String[] args) {
		
		
		Hero hr = new Hero();
		hr.hp=100;
		hr.name="손호수";
		
		hr.sit(5);		
		System.out.println(hr.hp);
	}
	
	
	
}
