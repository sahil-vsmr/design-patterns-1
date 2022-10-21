package com.codeit.designpatterns.observer;

public class Main {
    public static void main(String args[]) {
        Stock stock = new Stock("dash", 1000);
        Stock stock1 = new Stock("dash1", 500);
        Stock stock2 = new Stock("dash2", 750);
        Stock stock3 = new Stock("dash3", 1200);
        Stock stock4 = new Stock("dash4", 1400);
        Statusbar statusBar = new Statusbar();
        StockListView stockListView = new StockListView();

        // The status bar shows the popular stocks
        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        // The stock view list shows all stocks
        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        // Causes both statusBar and stockListView to get refreshed
        stock2.setPrice(21);

        // Causes only the stockListView to get refreshed. (statusBar
        // is not watching this stock.)
        stock3.setPrice(9);
    }
}
