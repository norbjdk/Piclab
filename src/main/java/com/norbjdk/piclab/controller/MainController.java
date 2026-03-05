package com.norbjdk.piclab.controller;

import com.norbjdk.piclab.model.ui.Presentable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable, Presentable {

    private @FXML BorderPane root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        present();
    }

    @Override
    public void initComponents() {

    }

    @Override
    public void setupComponents() {

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
