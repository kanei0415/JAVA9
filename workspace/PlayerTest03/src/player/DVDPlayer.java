package player;

public class DVDPlayer implements ExtendedPlayer {
	
	@Override
	public void play() {
		System.out.println("● DVD 플레이어 재생합니다~!");
	}
	
	@Override
	public void stop() {
		System.out.println("● DVD 플레이어 중지합니다~!");
	}
	
	@Override
	public void fast() {
		System.out.println("● DVD 플레이어 2배속합니다~!");
	}
	
	@Override
	public void slow() {
		System.out.println("● DVD 플레이어 0.5배속합니다~!");
	}
	
	@Override
	public void rewind() {
		System.out.println("● DVD 플레이어 다시보기합니다~!");
	}
}
