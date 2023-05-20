package ru.aleshev.springcourse;

import java.util.List;

public class PlayerMusic {
	//private Music music;
	private List<Music> Musiclist;
	private Integer voluem;
	private String name;
	
	public PlayerMusic() { }
	
	public PlayerMusic(List<Music> Musiclist) {
		this.Musiclist = Musiclist;
	}
	
	public void playMusic() {
		Musiclist.stream().forEach(a -> System.out.println(a.getSon()));
	}
	
	public void setMusic(List<Music> music) {
		this.Musiclist = music;
	}

	public int getVoluem() {
		return voluem;
	}

	public void setVoluem(int voluem) {
		this.voluem = voluem;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
