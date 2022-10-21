package com.codeit.designpatterns.template;

public abstract class Window {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.
        doBeforeClose();
        System.out.println("Removing the window from the screen");
        doAfterClose();
        //TODO: custom windows may need to execute some code after the window
        // is closed.
    }

    protected abstract void doBeforeClose();
    protected abstract void doAfterClose();
}
