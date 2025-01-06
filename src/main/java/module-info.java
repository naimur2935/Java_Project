module bd.edu.seu.java_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens bd.edu.seu.java_project to javafx.fxml;
    exports bd.edu.seu.java_project;
}