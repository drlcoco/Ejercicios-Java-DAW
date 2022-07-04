package application;
	
import java.net.URISyntaxException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage escenari) throws URISyntaxException {
        
        escenari.setResizable(false);
		escenari.getIcons();
		
		//DECLARO EL GRIDPANE Y LO ALINEO EN EL CENTRO.
		escenari.setTitle("Formulari d'entrada");
		GridPane raiz = new GridPane();
		raiz.setId("raiz");
		raiz.setAlignment(Pos.CENTER);
		
		Scene escena1 = new Scene(raiz,300,300);
		
		
		//DECLARO LA ESCENA, LOS ELEMENTOS Y LES DOY UN ID PARA EL CSS.
		escenari.setScene(escena1);
		Text identificacio = new Text("Identificació");
		identificacio.setId("identificacio");
		Label lusuario = new Label("Usuari:");
		TextField usuari = new TextField();
		Label lcontrasenya = new Label("Contrasenya:");
		PasswordField contrasenya = new PasswordField();
		Text resultat = new Text();
		resultat.setId("resultat");
		resultat.setFill(Color.PURPLE);//PINTO EL TEXTO DEL RESULTADO DE COLOR VERDE.
		Button entrar = new Button("Entrar");
		entrar.setId("entrar");
		
		//SEPARO LAS COLUMNAS:
		raiz.setHgap(10);
		//SEPARO LAS FILAS:
		raiz.setVgap(10);
		
		//ESTABLEZCO EN QUÉ FILA Y COLUMNA VA CADA ELEMENTO.
		raiz.setConstraints(identificacio, 1,0);
		raiz.setConstraints(lusuario,1,2);
		raiz.setConstraints(usuari,2,2);
		raiz.setConstraints(lcontrasenya,1,4);
		raiz.setConstraints(contrasenya,2,4);
		raiz.setConstraints(entrar,2,6);
		raiz.setConstraints(resultat,2,8);
				
		// EVENTO DEL BOTÓN. CUANDO SE PULSE APARECE EL SIGUIENTE TEXTO.
		entrar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				entrar.setId("pulsado");
				resultat.setText("Botó presionat");
				
			}
		});
		
		//AÑADO TODOS LOS ELEMENTOS AL GRIDPANE.
		raiz.getChildren().addAll(identificacio,lusuario,usuari,lcontrasenya,contrasenya,entrar,resultat);
		
		//ENLAZO EL CSS CON LA ESCENA.
		escena1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//MUESTRO EL ESCENARIO.
		escenari.show();
		
	}
}
