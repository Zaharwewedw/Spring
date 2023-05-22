package ru.aleshev.springcourse;

import org.springframework.stereotype.Component;

public class JassMusic implements Music{
	String arrSong = "jass" ;
	@Override
	public String getSon() {
		return arrSong;
	}

}
