package com.norbjdk.piclab;

import com.norbjdk.piclab.controller.MainController;
import com.norbjdk.piclab.util.FXMLUtil;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Piclab extends Application {
    static final int MIN_HEIGHT = 650;
    static final int MIN_WIDTH = 1200;

    @Override
    public void start(Stage stage) throws IOException {
        final MainController mainController = null;
        Scene scene = new Scene(FXMLUtil.loadFXML("main", mainController), MIN_WIDTH, MIN_HEIGHT);

        stage.setMinHeight(MIN_HEIGHT);
        stage.setMinWidth(MIN_WIDTH);
        stage.setTitle("PICLAB");
        stage.setScene(scene);

        stage.show();
    }


}
