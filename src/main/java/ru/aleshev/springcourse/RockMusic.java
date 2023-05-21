package ru.aleshev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
	private String[] arrSong = new String[] {
			"Rock_Hard", "Rock_Hard_Hard","Rock_Hard_Hard_Hard"
			};

	@Override
	public String[] getSon() {
		return arrSong;
	}
}