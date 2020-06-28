package Models;

import Interfaces.IStreamable;

public class Movie extends IStreamable {
    private String title;
    private String year;

    public Movie(String title, String year, int length, int bytesStream) {
        super(length, bytesStream);
        this.title = title;
        this.year = year;
    }

    @Override
    public int getLength() {
        return Length;
    }

    @Override
    public int getBytesSent() {
        return BytesSent;
    }

    @Override
    public void setLength(int length) {
        Length = length;
    }

    @Override
    public void setBytesSent(int bytesSent) {
        BytesSent = bytesSent;
    }
}
