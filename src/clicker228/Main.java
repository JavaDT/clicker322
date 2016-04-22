package clicker228;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}
	public void start(Stage primaryStage) throws Exception{
		Parent root=FXMLLoader.load(getClass().getResource("samp.fxml"));

		        primaryStage.setTitle("окно");
				primaryStage.setScene(new Scene(root, 500,600));
				primaryStage.show();

	}

}
