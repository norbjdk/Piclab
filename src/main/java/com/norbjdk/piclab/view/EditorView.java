package com.norbjdk.piclab.view;

import com.norbjdk.piclab.model.ui.Presentable;
import com.norbjdk.piclab.model.ui.ViewContainer;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class EditorView extends BorderPane implements Presentable, ViewContainer {

    private VBox inspectorBox;
    private ScrollPane editorBox;
    private Canvas contentCanvas;

    public EditorView() {
        present();
    }

    @Override
    public void initComponents() {
        inspectorBox = new VBox();
        editorBox = new ScrollPane();
        contentCanvas = new Canvas();
    }

    @Override
    public void setupComponents() {
        editorBox.setContent(contentCanvas);
    }

    @Override
    public void setupStyle() {

    }

    @Override
    public void setupLayout() {

    }

    @Override
    public void setupEventListeners() {

    }

    @Override
    public void setupEventHandlers() {

    }
}
