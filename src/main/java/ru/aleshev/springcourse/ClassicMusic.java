package ru.aleshev.springcourse;

import org.springframework.stereotype.Component;

public class ClassicMusic implements Music {
	String arrSong = "ClassicMusic" ;
	@Override
	public String getSon() {
		return arrSong;
	}
}
