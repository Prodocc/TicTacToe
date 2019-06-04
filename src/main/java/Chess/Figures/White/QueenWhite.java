package Chess.Figures.White;

import Chess.Figures.Figure;
import Chess.Figures.Cell;

public class QueenWhite implements Figure {
    private final Cell position;

    public QueenWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        return new Cell[] { dest };
    }

    @Override
    public Figure copy(Cell dest) {
        return new QueenWhite(dest);
    }
}
