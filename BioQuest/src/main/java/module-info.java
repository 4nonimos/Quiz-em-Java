module com.bioquest.bioquest {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bioquest.bioquest to javafx.fxml;
    exports com.bioquest.bioquest;
}
