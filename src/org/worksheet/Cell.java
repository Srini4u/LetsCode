package org.worksheet;

public class Cell {

    private String cellValue;

    public Cell(String cellValue) {
        this.cellValue = cellValue;
    }

    public String getCellValue() {
        return cellValue;
    }

    public void setCellValue(String cellValue) {
        this.cellValue = cellValue;
    }

    @Override
    public String toString() {
        return cellValue;
    }
}
