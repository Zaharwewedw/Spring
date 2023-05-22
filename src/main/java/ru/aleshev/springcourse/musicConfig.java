package ru.aleshev.springcourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("ru.aleshev.springcourse")
@PropertySource("classpath:Regular.property")
public class musicConfig {
	
	@Bean
	public RockMusic beanRock() {
		return new RockMusic();
	}
	@Bean
	public ClassicMusic beanClassic() {
		return new ClassicMusic();
	}
	@Bean
	public JassMusic beanJassMusic() {
		return new JassMusic();
	}
	@Bean
	public List<Music> beanList() {
		 List<Music>  musicList =  new ArrayList<>();
		 Collections.addAll(musicList, beanRock(), beanClassic(), beanJassMusic());
		 return musicList;
	}
	
	@Bean
	public PlayerMusic beanMusicPlayer() {
		return new PlayerMusic(beanList()) ;
	}
}
