package com.facade.eg1.step3;

import com.facade.eg1.step1.Player;
import com.facade.eg1.step1.Speaker;
import com.facade.eg1.step1.TV;
import com.facade.eg1.step2.HomeTheaterFacade;

public class HomeTheaterTestDrive {
	
	
	
	public static void main(String[] args) {
		 TV tv = new TV();
		 Speaker speaker = new Speaker();
		 Player player = new Player();
		 HomeTheaterFacade homeTheater = new HomeTheaterFacade(player, speaker, tv);
		 homeTheater.watchMovie("Movie1");
		 homeTheater.endMovie("Movie1");
	}
}
