package ru.aleshev.springcourse;

import org.springframework.stereotype.Component;


public class RockMusic implements Music {
	String arrSong = "Roc" ;
	@Override
	public String getSon() {
		return arrSong;
	}
}