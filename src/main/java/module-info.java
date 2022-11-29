module com.example.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    //requires javax.ws.rs;
    requires jersey.core;
    requires jersey.client;
    requires javax.ws.rs;

    opens com.example.javafxdemo to javafx.fxml;
    exports com.example.javafxdemo;
}