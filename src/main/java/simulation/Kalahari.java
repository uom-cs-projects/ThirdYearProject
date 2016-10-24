package simulation;

import simulation.grid.Grid;
import simulation.grid.cell.factories.CellFactory;
import simulation.grid.cell.factories.KalahariCellFactory;

public class Kalahari {

    private Grid grid;

    public Kalahari(int numberOfRows, int numberOfColumns, double proportionVegetation) {
        CellFactory kalahariCellFactory = new KalahariCellFactory(proportionVegetation);
        grid = new Grid(numberOfRows, numberOfColumns, kalahariCellFactory);
    }

    public void run() {
        grid.printToConsole();
    }
}