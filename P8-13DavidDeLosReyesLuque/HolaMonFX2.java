package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;


public class HolaMonFX2 extends Application {
	
	Label reposta;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage escenari) {
		
		escenari.setTitle("Hola Món");
		FlowPane rootNode = new FlowPane(10,10);
		rootNode.setAlignment(Pos.CENTER);
		
		Scene escena1 = new Scene(rootNode,300,100);
		
		escenari.setScene(escena1);
		reposta = new Label("Clica en el botó");
		
		Button btnA = new Button("Hola");
		Button btnB = new Button("Adeu");
		
		btnA.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				reposta.setText("Hola Món");
				
			}
		});
		
		btnB.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				reposta.setText("Adeu Món");
				
			}
		});
		
		rootNode.getChildren().addAll(btnA,btnB,reposta);
		
		escenari.show();
		
	}
}
