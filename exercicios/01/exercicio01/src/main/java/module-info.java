module com.exercicios.exercicio01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.formdev.flatlaf;
    requires java.desktop;


    opens com.exercicios.exercicio01 to javafx.fxml;
    exports com.exercicios.exercicio01;
}