import Interfaces.IStreamable;
import Models.*;

public class Startup {
    public static void main(String[] args) {
        IStreamable file = new File("Test",12,12);
        IStreamable music = new Music("Some name","Cool",15,2222);
        IStreamable movie = new Movie("Star Wars IV", "1977", 20, 3000);

        StreamProgressInfo streamFileInfo = new StreamProgressInfo(file);
        StreamProgressInfo streamMusicInfo = new StreamProgressInfo(music);
        StreamProgressInfo streamMovieInfo = new StreamProgressInfo(movie);

        System.out.println(streamFileInfo.CalculateCurrentProcess());
        System.out.println(streamMusicInfo.CalculateCurrentProcess());
        System.out.println(streamMovieInfo.CalculateCurrentProcess());
    }
}
