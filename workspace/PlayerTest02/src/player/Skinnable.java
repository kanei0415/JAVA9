package player;

// interface의 규칙
// 1. 메소드는 public abstract type 메소드만 가진다. (비추상 메소드나 일반 메소드는 가지지 못한다.)
// 2. 변수는 public static final type 변수만을 가진다.(인스던스 변수는 가질수 없다.)
public interface Skinnable { 
	/*public static final*/ int RED = 1;
	int GREEN = 2;
	int BLUE = 3;
	int BLACK = 4;
	int LEOPARD = 5;
	
	void changeSkin(int skin);
	
}
