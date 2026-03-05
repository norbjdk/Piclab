module com.norbjdk.piclab {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens com.norbjdk.piclab to javafx.fxml;
    exports com.norbjdk.piclab;
    opens com.norbjdk.piclab.controller to javafx.fxml;
    exports com.norbjdk.piclab.controller;
}