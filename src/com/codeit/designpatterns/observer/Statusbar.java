package com.codeit.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Statusbar implements Observer{
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    @Override
    public void show() {
        System.out.println("Statusbar Notified");
        for (Stock stock : stocks)
            System.out.println(stock);
    }
}
