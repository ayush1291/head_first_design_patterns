package com.adapter.eg3.step2;

import com.adapter.eg3.step1.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	   MediaPlayer mediaAdapter; 

	   @Override
	   public void play(String audioType, String fileName) throws Exception {		

	      //inbuilt support to play mp3 music files
	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: " + fileName);			
	      } 
	      //mediaAdapter is providing support to play other file formats
	      else{
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      
	   }   
	}
