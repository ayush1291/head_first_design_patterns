package com.adapter.eg3.step1;

public class Mp4Player implements AdvancedMediaPlayer{


	   @Override
	   public void play(String fileName) {
	      System.out.println("Playing mp4 file. Name: "+ fileName);		
	   }
	}