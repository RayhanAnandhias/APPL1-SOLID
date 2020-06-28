package Models;

import Interfaces.IStreamable;

public class StreamProgressInfo {
    private IStreamable file;

    public StreamProgressInfo(IStreamable file) {
        this.file = file;
    }

    public int CalculateCurrentProcess() {
        return file.getBytesSent()*100 / file.getLength();
    }

    public IStreamable getFile() {
        return file;
    }

    public void setFile(IStreamable file) {
        this.file = file;
    }
}
