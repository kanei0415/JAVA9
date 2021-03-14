package player;

public class VideoPlayer implements Player {
	
	private static int count = 0;
	
	private int id;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	@Override
	public void play() {
		System.out.println("■ 비디오 재생 시작~!");
	}
	
	@Override
	public void stop() {
		System.out.println("■ 비디오 재생 중지~!");
	}
	
	public void printInfo() {
		System.out.println("비디오 제조번호 : " + id);
	}
	
	public int getId() {
		return id;
	}
	
}
