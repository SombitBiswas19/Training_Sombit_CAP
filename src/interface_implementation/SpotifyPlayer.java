package interface_implementation;

public class SpotifyPlayer implements MusicPlayer {
	public void play()
	{
		System.out.println("Spotify Play");
	}
	public void pause()
	{
		System.out.println("Spotify Pause the music.");
	}
	public void stop()
	{
		System.out.println("Spotify stop the music.");
	}
}
