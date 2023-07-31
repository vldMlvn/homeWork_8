import drawing.ShapeDraw;
import shapes.*;

public class App {
    public static void main(String[] args) {

        ShapeDraw shapeDraw = new ShapeDraw();

        shapeDraw.drawing(new Quad());
        shapeDraw.drawing(new Triangle());
        shapeDraw.drawing(new Circle());
        shapeDraw.drawing(new Oval());
        shapeDraw.drawing(new Rectangle());
    }
}