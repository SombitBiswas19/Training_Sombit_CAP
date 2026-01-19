package interface_implementation;

public class YouTubeMusicPlayer implements MusicPlayer{
	public void play()
	{
		System.out.println("Youtube Play");
	}
	public void pause()
	{
		System.out.println("Youtube Pause the music.");
	}
	public void stop()
	{
		System.out.println("Youtube stop the music.");
	}
}
