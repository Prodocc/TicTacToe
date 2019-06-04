package Chess;

import Chess.Figures.Cell;
import Chess.Figures.Figure;

public class View {
    private final Figure[] figures = new Figure[32];
    private int index = 0;

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }


    public boolean move(Cell src, Cell dst) {
        boolean rst = false;
        int index = this.findBy(src);
        if (index != -1) {
            Cell[] steps = this.figures[index].way(src, dst);
            if (steps.length > 0 && steps[steps.length - 1].equals(dst)) {
                rst = true;
                this.figures[index] = this.figures[index].copy(dst);
            }
        }
        return rst;
    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
