package ru.aleshev.springcourse;

import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PlayerMusic {
	//private Music music;
//	@Autowired
//	@Qualifier ("jassMusic")
//	private Music music1;
//	
//	@Autowired
//	@Qualifier ("rockMusic")
//	private Music music2;
//	
//	private Music music3;
	public List<Music> listmusic;
	
	public PlayerMusic(List<Music> listmusic) {
		this.listmusic = listmusic;
	}
	
	public void playMusic() {
		System.out.print(((Music)listmusic.toArray()[new Random().nextInt(3)]).getSon());
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
