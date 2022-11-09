module pat.labA {
    requires javafx.controls;
    requires javafx.fxml;

    opens pat.labA to javafx.fxml;
    exports pat.labA;
}
