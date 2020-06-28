import Model.*;
import Interfaces.*;

public class Startup {
    public static void main(String[] args) {
        IShape circle = new Circle();
        IShape rect = new Rectangle();
        IShape square = new Square();

        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(circle);
        editor.drawShape(rect);
        editor.drawShape(square);
    }
}
