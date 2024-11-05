package org.worksheet;

import java.util.HashMap;
import java.util.Map;

public class Worksheet {

    private Map<Coordinates, Cell> sheet;

    public Worksheet() {
        this.sheet = new HashMap<>();
    }

    // Set a cell value at specific coordinates
    public void setCellValue(int row, int column, String value) {
        Coordinates coordinate = new Coordinates(row, column);
        Cell cell = new Cell(value);
        sheet.put(coordinate, cell);
    }

    // Get a cell value at specific coordinates
    public String getCellValue(int row, int column) {
        Coordinates coordinate = new Coordinates(row, column);
        Cell cell = sheet.get(coordinate);
        return cell != null ? cell.getCellValue() : "Cell not found";
    }
}
