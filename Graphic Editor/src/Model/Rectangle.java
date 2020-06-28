package Model;

import Interfaces.IShape;

public class Rectangle implements IShape {
    @Override
    public String Draw() {
        return "I'm Rectangle";
    }
}
