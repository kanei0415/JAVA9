package test;

import player.*;

public class PlayerTest01 {
	public static void main(String[] args) {
		
//		Player p = new Player(); // 인터페이스는 인스턴스를 만들 수 없다.
		
		// 1번
//		Player[] players = new Player[4];
//		players[0] = new CDPlayer();
//		players[1] = new VideoPlayer();
//		players[2] = new CDPlayer();
//		players[3] = new VideoPlayer();
		
		// 2번
		Player[] players = {
			new CDPlayer(),
			new VideoPlayer(),
			new CDPlayer(),
			new VideoPlayer(),
		};
		
		//1번
		for(int i=0; i<players.length; i++) {
			players[i].play(); // 재생
			System.out.println();
			players[i].stop(); // 중지
			System.out.println();
			
			// CDPlayer를 참조한다면
			if(players[i] instanceof CDPlayer) { // CDPlayer 청소
				((CDPlayer) players[i]).clean();
			}
			// VideoPlayer를 참조한다면
			else if(players[i] instanceof VideoPlayer) { // VideoPlayer 정보출력
				((VideoPlayer) players[i]).printInfo();
			}
			System.out.println();
		}
		System.out.println();
		
		// 2번
		for(Player p : players) {
			p.play(); // 재생
			System.out.println();
			p.stop(); // 중지
			System.out.println();
			// CDPlayer를 참조한다면
			if(p instanceof CDPlayer) { // CDPlayer 청소
				((CDPlayer) p).clean();
			}
			// VideoPlayer를 참조한다면
			else if(p instanceof VideoPlayer) { // VideoPlayer 정보출력
				((VideoPlayer) p).printInfo();
			}
			System.out.println();
		}
		System.out.println();
	}
}
