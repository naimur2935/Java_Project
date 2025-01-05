module bd.edu.seu.java_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens bd.edu.seu.java_project to javafx.fxml;
    exports bd.edu.seu.java_project;
}