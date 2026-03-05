package com.norbjdk.piclab.component;

import com.norbjdk.piclab.model.ui.Presentable;
import com.norbjdk.piclab.util.ButtonFactory;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

import java.util.Objects;

public class NavigationBar extends HBox implements Presentable {
    private Button homeBtn;
    private Button editorBtn;
    private Button collectionBtn;
    private Button createBtn;
    private Button openBtn;
    private Button saveBtn;
    private Button settingsBtn;

    public NavigationBar() {
        present();
    }

    @Override
    public void initComponents() {
        homeBtn = ButtonFactory.createButton("Home", "home-btn", "Switch to Home", "nav-btn");
        editorBtn = ButtonFactory.createButton("Editor", "editor-btn", "Switch to Editor", "nav-btn");
        collectionBtn = ButtonFactory.createButton("Collection", "collection-btn", "Switch to Collection", "nav-btn");
        createBtn = ButtonFactory.createButton("Create", "create-btn", "Create new project", "nav-btn");
        openBtn = ButtonFactory.createButton("Open", "open-btn", "Open image", "nav-btn");
        saveBtn = ButtonFactory.createButton("Save", "save-btn", "Save image", "nav-btn");
        settingsBtn = ButtonFactory.createButton("Settings", "settings-btn", "Switch to Settings", "nav-btn");
    }

    @Override
    public void setupComponents() {
        ButtonFactory.addIcon(homeBtn, FontAwesomeSolid.HOME, 15, Color.rgb(254, 254, 254));
        ButtonFactory.addIcon(editorBtn, FontAwesomeSolid.PEN_FANCY, 15, Color.rgb(254, 254, 254));
        ButtonFactory.addIcon(collectionBtn, FontAwesomeSolid.LAYER_GROUP, 15, Color.rgb(254, 254, 254));
        ButtonFactory.addIcon(createBtn, FontAwesomeSolid.PLUS_CIRCLE, 15, Color.rgb(254, 254, 254));
        ButtonFactory.addIcon(openBtn, FontAwesomeSolid.FOLDER_OPEN, 15, Color.rgb(254, 254, 254));
        ButtonFactory.addIcon(saveBtn, FontAwesomeSolid.SAVE, 15, Color.rgb(254, 254, 254));
        ButtonFactory.addIcon(settingsBtn, FontAwesomeSolid.COG, 15, Color.rgb(254, 254, 254));
    }

    @Override
    public void setupStyle() {
        this.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/norbjdk/piclab/styles/navigation-bar.css")).toExternalForm());
        this.getStyleClass().add("navigation-bar");
    }

    @Override
    public void setupLayout() {
        getChildren().addAll(
                homeBtn,
                editorBtn,
                createSpacer(),
                collectionBtn,
                createBtn,
                openBtn,
                saveBtn,
                createSpacer(),
                settingsBtn
        );
    }

    @Override
    public void setupEventListeners() {

    }

    @Override
    public void setupEventHandlers() {

    }

    private Region createSpacer() {
        Region region = new Region();
        HBox.setHgrow(region, Priority.ALWAYS);

        return region;
    }
}
