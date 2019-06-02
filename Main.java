package packageName;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException{
			
			FXMLLoader loader=new FXMLLoader (getClass().getResource("Main.fxml"));
			Parent root=loader.load();
			Scene scene =new Scene(root);
			
			primaryStage.setTitle("TITLE");
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
