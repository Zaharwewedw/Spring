package ru.aleshev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
	String[] arrSong = new String[] {
			"ClassicMusic", "ClassicMusic_ClassicMusic","ClassicMusic_ClassicMusic_ClassicMusic"
			};
	@Override
	public String[] getSon() {
		return arrSong;
	}
}
