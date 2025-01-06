package bd.edu.seu.java_project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LibraryManagementController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}