//25. Media Player
interface AudioPlayer{
	public void playAudio(String song);
}
interface VideoPlayer{
	public void playVideo(String movie);
}
class MediaPlayer implements AudioPlayer,VideoPlayer{
	@Override
	public void playAudio(String song){
		System.out.println("Playing Audio: "+song);
	}
	
	@Override
	public void playVideo(String movie){
		System.out.println("Playing Video: "+movie);
	}
}
public class MediaPlayerDemo{
	public static void main(String[] args){
		AudioPlayer m1 = new MediaPlayer();
		VideoPlayer m2 = new MediaPlayer();
		m1.playAudio("Shape of you");
		m2.playVideo("Inception");
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac MediaPlayerDemo.java
D:\CDAC\OOPJ\Assignment 3>java MediaPlayerDemo

Playing Audio: Shape of you
Playing Video: Inception
*/



