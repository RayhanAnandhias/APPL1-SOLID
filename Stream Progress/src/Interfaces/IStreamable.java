package Interfaces;

public abstract class IStreamable {
    protected int Length;
    protected int BytesSent;

    public IStreamable(int length, int bytesSent) {
        this.Length = length;
        this.BytesSent = bytesSent;
    }

    public abstract int getLength();
    public abstract int getBytesSent();
    public abstract void setLength(int length);
    public abstract void setBytesSent(int bytesSent);
}
