package Model;

import Interfaces.IShape;

public class Square implements IShape {
    @Override
    public String Draw() {
        return "I'm Square";
    }
}
