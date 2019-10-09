import javafx.scene.shape.Rectangle;

public class Figure extends Rectangle {
    private boolean markX = false;
    private boolean markO = false;

    public Figure() {
    }

    public Figure(boolean markX, boolean markO) {
        this.markX = markX;
        this.markO = markO;
    }

    public void take(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }

    public boolean hasMarkX() {
        return this.markX;
    }

    public boolean hasMarkO() {
        return this.markO;
    }


    @Override
    public String toString() {
        return "Figure{" +
                "markX=" + markX +
                ", markO=" + markO +
                '}';
    }
}
