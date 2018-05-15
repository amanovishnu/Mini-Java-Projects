package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.MainModel;

public class ForgotPasswordController implements Initializable{
	public MainModel loginModel = new MainModel();
	@FXML Label forgotlabelstatus;
	@FXML TextField forgotemail;
	@FXML TextField forgotanswer;
	public void recoveraccount(ActionEvent event) throws Exception {
		if(loginModel.isrelogin(forgotemail.getText(),forgotcombobox.getSelectionModel().getSelectedItem(),forgotanswer.getText())) {
			forgotlabelstatus.setText("Login Success");
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			Parent rootnode = FXMLLoader.load(getClass().getResource("/view/Welcome.fxml"));
			Scene scene = new Scene(rootnode);
			scene.getStylesheets().add(getClass().getResource("/resources/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("JavaFx Application");
			primaryStage.show();		
		} else if(forgotemail.getText().equals("") && forgotanswer.getText().equals("")) {
			forgotlabelstatus.setText("Please Enter Details");
		} else {
			forgotlabelstatus.setText("Login Failed");
		}
	}	
	
	
	public void returntologinpage(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent rootnode = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
		Scene scene = new Scene(rootnode);
		scene.getStylesheets().add(getClass().getResource("/resources/application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFx Application");
		primaryStage.show();
	}
	
	@FXML public ComboBox<String> forgotcombobox;
	ObservableList<String> list = FXCollections.observableArrayList("What was your First book?","What's your Wife DOB?","What was your First Pet?","Who was your first Love?");
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		forgotcombobox.setItems(list);
	}
}
