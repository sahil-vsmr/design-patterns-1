package com.codeit.designpatterns.iterator;

public class Main {
    public static void main(String args[]) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product(1, "Product1"));
        productCollection.add(new Product(2, "Product2"));
        productCollection.add(new Product(3, "Product3"));
        productCollection.add(new Product(4, "Product4"));

        Iterator iterator = productCollection.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current().toString());
            iterator.next();
        }

    }
}
