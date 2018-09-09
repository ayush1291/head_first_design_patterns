package com.adapter.eg3.step1;

public class VlcPlayer implements AdvancedMediaPlayer{
	   @Override
	   public void play(String fileName) {
	      System.out.println("Playing vlc file. Name: "+ fileName);		
	   }
	}
