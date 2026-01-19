package interface_implementation;

public class DriverMusic {

	public static void main(String[] args) {
		SpotifyPlayer spotify=new SpotifyPlayer();
		spotify.play();
		spotify.pause();
		spotify.stop();
		YouTubeMusicPlayer yt=new YouTubeMusicPlayer();
		yt.play();
		yt.pause();
		yt.stop();

	}

}
