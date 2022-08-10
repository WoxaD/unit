module ru.netology.unit {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.netology.unit to javafx.fxml;
    exports ru.netology.unit;
}