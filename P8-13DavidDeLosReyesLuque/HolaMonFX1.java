package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;


public class HolaMonFX1 extends Application {
	
	TextField reposta;
	private int numClicks = 0;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage escenari) {
		
		escenari.setTitle("My first window");
		FlowPane rootNode = new FlowPane(10,10);
		rootNode.setAlignment(Pos.CENTER);
		
		Scene escena1 = new Scene(rootNode,350,100);
		
		escenari.setScene(escena1);
		reposta = new TextField();
		
		Button btnA = new Button("Click me");
		
		btnA.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				numClicks++;
				reposta.setText("Button clicked "+ numClicks +" times");
				
			}
		});
		
		rootNode.getChildren().addAll(btnA,reposta);
		
		escenari.show();
	}
}
