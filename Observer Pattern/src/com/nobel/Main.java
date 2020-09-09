package com.nobel;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        SpreadSheet spreadSheet = new SpreadSheet(dataSource);
        Chart chart = new Chart(dataSource);

        dataSource.addObserver(chart);
        dataSource.addObserver(spreadSheet);
        dataSource.setValue(10);
    }
}
