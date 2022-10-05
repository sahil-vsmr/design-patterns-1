package com.codeit.designpatterns.memento;

public class EditorState {
    private final String contentName;
    private final String fontName;
    private final int fontSize;


    public EditorState(String contentName, String fontName, int fontSize) {
        this.contentName = contentName;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContentName() {
        return contentName;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
