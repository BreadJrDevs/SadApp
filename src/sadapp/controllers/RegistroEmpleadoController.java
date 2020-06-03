package sadapp.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class RegistroEmpleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPaterno;

    @FXML
    private TextField txtMaterno;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtContraseña;

    @FXML
    private TextField txtContraseña2;

    @FXML
    private Button btnRegistrar;

    @FXML
    private Button btnCancelar;

    @FXML
    private RadioButton radioHombre;

    @FXML
    private ToggleGroup sexo;

    @FXML
    private RadioButton radioMujer;

    @FXML
    private ImageView imgSexo;

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void registrar(ActionEvent event) {

    }

    @FXML
    void initialize() {
       
    }
}
