package com.codeit.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<EditorState> states = new ArrayList<>();

    public void push(EditorState editorState) {
        states.add(editorState);
    }

    public EditorState pop() {
        int lastIndex = states.size() - 1;
        EditorState lastElement = states.get(lastIndex);
        states.remove(lastElement);
        return lastElement;
    }
}
