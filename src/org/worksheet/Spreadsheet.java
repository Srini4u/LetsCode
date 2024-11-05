package org.worksheet;

import java.util.HashMap;
import java.util.Map;

public class Spreadsheet {

    private Map<String, Worksheet> sheets;

    public Spreadsheet() {
        this.sheets = new HashMap<>();
    }

    // Method to create and add a new sheet
    public void addSheet(String sheetName) {
        sheets.put(sheetName, new Worksheet());
    }

    // Method to set a cell value in a specific sheet
    public void setCellValue(String sheetName, int row, int column, String value) {
        Worksheet sheet = sheets.get(sheetName);
        if (sheet == null) {
            System.out.println("Sheet " + sheetName + " does not exist.");
            return;
        }
        sheet.setCellValue(row, column, value);
    }

    // Method to retrieve a cell value in a specific sheet
    public String getCellValue(String sheetName, int row, int column) {
        Worksheet sheet = sheets.get(sheetName);
        if (sheet == null) {
            return "Sheet " + sheetName + " does not exist.";
        }
        return sheet.getCellValue(row, column);
    }

    public static void main(String[] args) {
        Spreadsheet spreadsheet = new Spreadsheet();

        // Create multiple sheets
        spreadsheet.addSheet("Sheet1");
        spreadsheet.addSheet("Sheet2");

        // Set values in Sheet1
        spreadsheet.setCellValue("Sheet1", 0, 0, "Hello");
        spreadsheet.setCellValue("Sheet1", 1, 1, "World");

        // Retrieve values from Sheet1
        System.out.println("Value at (0,0) in Sheet1: " + spreadsheet.getCellValue("Sheet1", 0, 0));
        System.out.println("Value at (1,1) in Sheet1: " + spreadsheet.getCellValue("Sheet1", 1, 1));

        // Example with another sheet
        spreadsheet.setCellValue("Sheet2", 0, 0, "Data");
        System.out.println("Value at (0,0) in Sheet2: " + spreadsheet.getCellValue("Sheet2", 0, 0));
    }
}
