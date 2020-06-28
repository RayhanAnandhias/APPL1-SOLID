package Model;

import Interfaces.IShape;

public class Circle implements IShape {

    @Override
    public String Draw() {
        return "I'm Circle";
    }
}
