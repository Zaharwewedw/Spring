package ru.aleshev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
	public static void  main(String[] args) {
		PlayerMusic music = null;
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext (
				"applicationContext.xml");) {
			music = context.getBean("playerMusic", PlayerMusic.class);
		} catch (Exception e) {
            e.printStackTrace();
        }	
		music.playMusic(MusicEnum.CLASSICMUSIC);
		
		System.out.print(music.getVoluem());
	}
}