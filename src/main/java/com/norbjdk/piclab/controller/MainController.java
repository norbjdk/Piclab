package com.norbjdk.piclab.controller;

import com.norbjdk.piclab.component.NavigationBar;
import com.norbjdk.piclab.manager.EventBus;
import com.norbjdk.piclab.model.dto.ViewResponse;
import com.norbjdk.piclab.model.event.ViewChangedEvent;
import com.norbjdk.piclab.model.ui.Presentable;
import com.norbjdk.piclab.model.ui.ViewContainer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable, Presentable {

    private @FXML BorderPane root;

    private NavigationBar navigationBar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        present();
    }

    @Override
    public void initComponents() {
        navigationBar = new NavigationBar();
    }

    @Override
    public void setupComponents() {

    }

    @Override
    public void setupStyle() {

    }

    @Override
    public void setupLayout() {
        root.setTop(navigationBar);
    }

    @Override
    public void setupEventListeners() {
        EventBus.getInstance().subscribe(ViewChangedEvent.class, this::handleViewChanged);
    }

    @Override
    public void setupEventHandlers() {

    }

    private <V extends ViewContainer> void changeView(ViewResponse<V> response) {
        final V newView = response.getView();

        if (newView != null) {
            final Node currentView = root.getCenter();

            if (currentView != newView) {
                root.setCenter((Node) newView);
            }
        }
    }

    private <V extends ViewContainer> void handleViewChanged(ViewChangedEvent<V> event){
        final var response = event.getResponse();

        changeView(response);
    }
}
