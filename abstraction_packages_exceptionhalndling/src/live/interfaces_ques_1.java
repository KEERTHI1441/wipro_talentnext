package live;

import music.Playable;
import music.string.*;
import music.wind.*;
public class interfaces_ques_1 {
	public static void main(String[] args) {
		Veena v=new Veena();
		Saxophone s=new Saxophone();
		v.play();
		s.play();
		Playable p=v;
		p.play();
		p=s;
		p.play();
	}
}
