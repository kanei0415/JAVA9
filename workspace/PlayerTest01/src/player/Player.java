package player;

// interface의 규칙
// 1. 인터페이스는 추상 메소드만을 갖는다. (비추상 메소드는 존재하지 않는다.)
// 2. 인터페이스의 추상 메소드는 public abstract 를 생략할 수 있다.
// 3. interface는 instance는 만들 수 없다. -> (다형성을 구현할 목적이다.)
// 4. interface의 interface reference array는 만들 수 있다 -> (다형성을 구현할 목적이다.)

public interface Player {
// public abstract -> by default
	void play();

	void stop();

}
