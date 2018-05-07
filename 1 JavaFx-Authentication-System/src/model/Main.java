package model;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent rootnode = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
			//BorderPane root = new BorderPane();
			Scene scene = new Scene(rootnode);
			scene.getStylesheets().add(getClass().getResource("/resources/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("JavaFx Application");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
