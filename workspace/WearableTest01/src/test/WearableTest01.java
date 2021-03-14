package test;

import wearable.*;

public class WearableTest01 {
	public static void main(String[] args) {
		
		// 1锅 规过
//		Wearable[] wearables = new Wearable[4];
//		
//		wearables[0] = new WearableComputer("付农 1");
//		wearables[1] = new WearableRobot(Color.RED);
//		wearables[2] = new WearableComputer("付农 2");
//		wearables[3] = new WearableRobot(Color.BLUE);
		
		// 2锅 规过
		Wearable[] wearables = {
				new WearableComputer("付农 1"),
				new WearableRobot(Color.RED),
				new WearableComputer("付农 2"),
				new WearableRobot(Color.BLUE),	
		};
		
//		for(Wearable w : wearables) {
//			w.putOn();
//			w.putOff();
//			System.out.println();
//		}
		
		for(int i=0; i<wearables.length; i++) {
			wearables[i].putOn();
			wearables[i].putOff();
			System.out.println();
		}
		
	}
}
