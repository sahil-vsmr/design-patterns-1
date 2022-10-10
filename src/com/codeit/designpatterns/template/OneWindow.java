package com.codeit.designpatterns.template;

public class OneWindow extends Window{
    @Override
    protected void doBeforeClose() {
        System.out.println("before closing one window");
    }

    @Override
    protected void doAfterClose() {
        System.out.println("after closing one window");
    }
}
