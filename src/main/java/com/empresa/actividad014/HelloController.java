package com.empresa.actividad014;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField textcorreo;
    @FXML
    private PasswordField textcontrasena;
    @FXML
    private PasswordField textcontrasenac;
    @FXML
    private DatePicker fecha;
    @FXML
    private CheckBox privacidad;
    @FXML
    private Label text_confirm;

    @FXML
    protected void onRegisterButtonClick() {
        if (textcorreo.getText().isEmpty() || textcontrasena.getText().isEmpty() || textcontrasenac.getText().isEmpty() || fecha.getValue() == null || !privacidad.isSelected()) {
            text_confirm.setText("Por favor, completa todos los campos y acepta los términos de privacidad.");
        } else if (!textcontrasena.getText().equals(textcontrasenac.getText())) {
            text_confirm.setText("Las contraseñas no coinciden");
        } else {
            text_confirm.setText("Usuario registrado.");
        }
    }
}