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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.MainModel;

public class CreateAccountController implements Initializable {
	public MainModel loginModel = new MainModel();
	@FXML TextField createname;
	@FXML TextField createusername;
	@FXML TextField createemail;
	@FXML TextField createpassword;
	@FXML TextField createanswer;
	@FXML Label createlabelstatus;
	@FXML DatePicker createdateofbirth;
	public void createaccount(ActionEvent event) throws Exception {
		if(loginModel.isregister(createname.getText(),createusername.getText(),createemail.getText(),createpassword.getText(),createcombobox.getSelectionModel().getSelectedItem(),createanswer.getText())) {
				createlabelstatus.setText("Account Created");
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage primaryStage = new Stage();
				Parent rootnode = FXMLLoader.load(getClass().getResource("/view/Welcome.fxml"));
				Scene scene = new Scene(rootnode);
				scene.getStylesheets().add(getClass().getResource("/resources/application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.setTitle("JavaFx Application");
				primaryStage.show();
			} else if(createname.getText().equals("") || createusername.getText().equals("") || createemail.getText().equals("")){
				createlabelstatus.setText("Enter Valid Details");
			}
	}
	
	public void alreadyregisteredclickhere(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent rootnode = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
		Scene scene = new Scene(rootnode);
		scene.getStylesheets().add(getClass().getResource("/resources/application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFx Application");
		primaryStage.show();
	}
	@FXML public ComboBox<String> createcombobox;
	ObservableList<String> list = FXCollections.observableArrayList("What was your First book?","What's your Wife DOB?","What was your First Pet?","Who was your first Love?");
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		createcombobox.setItems(list);
	}
}
