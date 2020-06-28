package Model;

import Interfaces.IShape;

public class GraphicEditor {

    public void drawShape(IShape shape) {
        System.out.println(shape.Draw());
    }
}
