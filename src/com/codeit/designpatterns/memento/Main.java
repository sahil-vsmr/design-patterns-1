package com.codeit.designpatterns.memento;

public class Main {
    public static void main(String args[]) {
        System.out.println("In here");
        Editor editor = new Editor("a", "b", 1);
        History history = new History();
        history.push(editor.createState());
        editor.setContentName("aa");
        editor.setFontName("bb");
        editor.setFontSize(2);
        history.push(editor.createState());
        editor.setContentName("aaa");
        editor.setFontName("bbb");
        editor.setFontSize(3);
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());
        System.out.println(editor.printContent());


    }
}
