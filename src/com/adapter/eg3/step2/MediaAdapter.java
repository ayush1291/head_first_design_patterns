package com.adapter.eg3.step2;

import com.adapter.eg3.step1.AdvancedMediaPlayer;
import com.adapter.eg3.step1.MediaPlayer;
import com.adapter.eg3.step1.Mp4Player;
import com.adapter.eg3.step1.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

	   AdvancedMediaPlayer advancedMusicPlayer;

	   public MediaAdapter(String audioType) throws Exception{
	   
	      if(audioType.equalsIgnoreCase("vlc") ){
	         advancedMusicPlayer = new VlcPlayer();			
	         
	      }else if (audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer = new Mp4Player();
	      }	else{
	    	  throw new Exception("Format not supported");
	      }
	   }

	   @Override
	   public void play(String audioType, String fileName) {
	         advancedMusicPlayer.play(fileName);
	   }
	}
