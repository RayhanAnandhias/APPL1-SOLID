package Models;

import Interfaces.IStreamable;

public class File extends IStreamable {
    private String name;

    public File(String name, int length, int bytesSent) {
        super(length, bytesSent);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public void setLength(int length) { Length = length; }

    @Override
    public void setBytesSent(int bytesSent) {
        BytesSent = bytesSent;
    }
}
