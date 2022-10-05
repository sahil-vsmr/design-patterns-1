package com.codeit.designpatterns.memento;

public class Editor {

    private String contentName;
    private String fontName;
    private int fontSize;

    public Editor(String contentName, String fontName, int fontSize) {
        this.contentName = contentName;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public EditorState createState() {
        return new EditorState(contentName, fontName, fontSize);
    }

    public void restoreState(EditorState editorState) {
        contentName = editorState.getContentName();
        fontName = editorState.getFontName();
        fontSize = editorState.getFontSize();
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String printContent() {
        return contentName+fontName+fontSize;
    }
}
