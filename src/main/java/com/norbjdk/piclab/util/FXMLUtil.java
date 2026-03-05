package com.norbjdk.piclab.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public final class FXMLUtil {
    private FXMLUtil() {}

    public static <T> Parent loadFXML(String fileName, T controller) {
        try {
            final FXMLLoader loader = new FXMLLoader(FXMLUtil.class.getResource("/com/norbjdk/piclab/fxml/" + fileName + ".fxml"));

            loader.setController(controller);

            return loader.load();
        } catch (Exception e) {
            throw new RuntimeException("Failed to load FXML: " + fileName, e);
        }
    }
}
