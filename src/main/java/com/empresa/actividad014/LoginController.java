package com.empresa.actividad014;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label loginMessageLabel;

    @FXML
    protected void onLoginButtonClick() {
        if (usernameField.getText().equals("admin@gmail.com") && passwordField.getText().equals("123")) {
            loginMessageLabel.setText("Inicio correcto.");
        } else {
            loginMessageLabel.setText("Inicio incorrecto.");
        }
    }
}