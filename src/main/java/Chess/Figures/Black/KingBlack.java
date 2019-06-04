package Chess.Figures.Black;

import Chess.Figures.Figure;
import Chess.Figures.Cell;

public class KingBlack implements Figure {
    private final Cell position;

    public KingBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        return new Cell[]{dest};
    }

    @Override
    public Figure copy(Cell dest) {
        return new KingBlack(dest);
    }
}
