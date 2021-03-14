package player;

// 1. 여러개의 인터페이스를 구현하는 클래스를 만드는 것은 가능하다.
// - 다중구현은 가능하다.
public class PortablePlayer implements Player, Skinnable {
	
	@Override
	public void play() {
		System.out.println("◆포터블  플레이어 재생~!");
	}
	
	@Override
	public void stop() {
		System.out.println("◆포터블  플레이어 중지~!");
	}
	
	@Override
	public void changeSkin(int skin) {
		System.out.print("스킨을 ");
		switch(skin) {
		case RED: System.out.print("빨강"); break;
		case GREEN: System.out.print("초록"); break;
		case BLUE: System.out.print("파랑"); break;
		case BLACK: System.out.print("검정"); break;
		case LEOPARD: System.out.print("표범무늬"); break;
		default: System.out.print("흰"); break;
		}
		System.out.println("색으로 변경하였습니다.");
	}
	
}
