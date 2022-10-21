package com.codeit.designpatterns.template;

public class TwoWindow extends Window{
    @Override
    protected void doBeforeClose() {
        System.out.println("before closing two window");
    }

    @Override
    protected void doAfterClose() {
        System.out.println("after closing two window");
    }
}
