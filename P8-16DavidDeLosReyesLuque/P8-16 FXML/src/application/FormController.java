package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class FormController implements Initializable{
	
	@FXML private Label identificacio;
	@FXML private Label lusuari;
	@FXML private Label lcontrasenya;
	@FXML private Label resultat;
	@FXML private TextField usuari;
	@FXML private PasswordField contrasenya;
	@FXML private Button entrar;
	@FXML private ImageView image;
	
	public FormController() {
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {}
	
	@FXML
		public void accio(ActionEvent e) {
			
			entrar.setId("pulsado");
			resultat.setText("Botó presionat");
		}
	
}
