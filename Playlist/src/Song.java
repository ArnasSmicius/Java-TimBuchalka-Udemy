/**
 * Created by Arnas on 2017.04.20.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getTitle() + ": " + this.duration;
    }
}
