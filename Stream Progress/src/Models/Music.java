package Models;

import Interfaces.IStreamable;

public class Music extends IStreamable {
    private String artist;
    private String album;

    public Music(String artist, String album, int length, int bytesSent) {
        super(length, bytesSent);
        this.artist = artist;
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtist(String artist) {
        this.artist = artist;
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
