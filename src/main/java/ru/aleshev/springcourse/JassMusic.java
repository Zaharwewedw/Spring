package ru.aleshev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class JassMusic implements Music{
	String[] arrSong = new String[] {
			"JassMusic", "JassMusic_JassMusic","JassMusic_JassMusic_JassMusic"
			};
	@Override
	public String[] getSon() {
		return arrSong;
	}

}
