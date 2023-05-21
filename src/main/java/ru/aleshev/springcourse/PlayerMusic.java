package ru.aleshev.springcourse;

import java.util.Random;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PlayerMusic {
	//private Music music;
	@Autowired
	@Qualifier ("jassMusic")
	private Music music1;
	
	@Autowired
	@Qualifier ("rockMusic")
	private Music music2;
	
	@Autowired
	@Qualifier ("classicMusic")
	private Music music3;
	
	public PlayerMusic() { }
	
	public void playMusic(MusicEnum enumMusic) {
		Random r = new Random();
        int x = r.nextInt(3) + 1;
		switch (enumMusic) {
		case JASSMUSIC: System.out.println(music1.getSon()[x-1]);
		case ROCKMUSIC: System.out.println(music2.getSon()[x-1]);
		case CLASSICMUSIC: System.out.println(music3.getSon()[x-1]);
		}
	}
	
	@Value("${volue1}")
	private Integer voluem;
	@Value("${volue1}")
	private String name;
//	public void setMusic(Music music) { }
	
	@Deprecated
	public int getVoluem() {
		return voluem;
	}
	@Deprecated
	public void setVoluem(int voluem) {
		this.voluem = voluem;
	}
	@Deprecated
	public String getName() {
		return name;
	}
	@Deprecated
	public void setName(String name) {
		this.name = name;
	}
	@Deprecated
	public void metInit() {
		System.out.println("metInit");
	}
	@Deprecated
	public void metDestroy() {
		System.out.println("metDestroy");
	}
}
