package com.facade.eg1.step2;

import com.facade.eg1.step1.Player;
import com.facade.eg1.step1.Speaker;
import com.facade.eg1.step1.TV;

public class HomeTheaterFacade {

	Player player;
	Speaker speaker;
	TV tv;
	
	public HomeTheaterFacade(Player player, Speaker speaker, TV tv) {
		this.player = player;
		this.speaker = speaker;
		this.tv = tv;
	}
	
	public void watchMovie(String movie) {
		 System.out.println("Get ready to watch a movie...");
		 tv.on();
		 speaker.setVolume(10);
		 player.play(movie);
	}
	public void endMovie(String movie) {
		 tv.off();
		 speaker.off();
		 player.stop(movie);
		 System.out.println("Movie over...");
	}
}
