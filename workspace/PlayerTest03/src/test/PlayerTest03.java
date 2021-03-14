package test;

import player.*;

public class PlayerTest03 {
	public static void main(String[] args) {
		DVDPlayer dvd = new DVDPlayer();
		
		dvd.play();
		dvd.fast();
		dvd.slow();
		dvd.stop();
		dvd.rewind();
		
	}
}
