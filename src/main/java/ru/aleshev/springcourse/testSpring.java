package ru.aleshev.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
	public static void  main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(musicConfig.class);
	
		PlayerMusic music = context.getBean("playerMusic", PlayerMusic.class);
		music.playMusic();
	}
}