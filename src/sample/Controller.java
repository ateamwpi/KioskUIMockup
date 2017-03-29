package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import static sun.nio.ch.IOUtil.load;

public class Controller {
    //Main Menu Buttons
    @FXML
    private Button mapViewBtn;
    @FXML
    private Button directionsMenuBtn;
    @FXML
    private Button adminBtn;

    //Map View buttons
    @FXML
    private Button floor1Btn;
    @FXML
    private Button floor2Btn;
    @FXML
    private Button floor3Btn;
    @FXML
    private Button floor4Btn;
    @FXML
    private Button floor5Btn;
    @FXML
    private Button floor6Btn;
    @FXML
    private Button floor7Btn;
    @FXML
    private Button floor8Btn;
    @FXML
    private Button mapViewBackButton;

    //Admin Login Buttons
    @FXML
    private Button adminLoginBtn;
    @FXML
    private Button adminBackBtn;

    //Admin Menu Buttons
    @FXML
    private Button adminLogoutBtn;
    @FXML
    private Button editDoctorsBtn;
    @FXML
    private Button addLocationsBtn;
    @FXML
    private Button removeLocationsBtn;

    //Directory Buttons
    @FXML
    private Button directoryBackBtn;
    @FXML
    private Button fullDirectoryBtn;
    @FXML
    private Button professionalsBtn;
    @FXML
    private Button departmentsBtn;
    @FXML
    private Button directoryOtherBtn;
    @FXML
    private Button frequentLocationsBtn;

    //Directions Screen Buttons
    @FXML
    private Button directionsBackBtn;

    //Admin Submenu Buttons
    @FXML
    private Button backToAdminBtn;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if (event.getSource() == mapViewBtn) {
            //get reference to the button's stage
            stage = (Stage) mapViewBtn.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getResource("MapView.fxml"));
        } else if (event.getSource() == mapViewBackButton){
            stage = (Stage) mapViewBackButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        } else if (event.getSource() == adminBtn) {
            stage = (Stage) adminBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        } else if (event.getSource() == adminBackBtn){
            stage = (Stage) adminBackBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        } else if (event.getSource() == adminLoginBtn){
            stage = (Stage) adminLoginBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
        } else if (event.getSource() == adminLogoutBtn){
            stage = (Stage) adminLogoutBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        } else if (event.getSource() == directoryBackBtn){
            stage = (Stage) directoryBackBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        } else if (event.getSource() == directionsMenuBtn){
            stage = (Stage) directionsMenuBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Directory.fxml"));
        } else if (event.getSource() == directionsBackBtn){
            stage = (Stage) directionsBackBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Directory.fxml"));
        } else if (event.getSource() == editDoctorsBtn){
            stage = (Stage) editDoctorsBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("DoctorEdit.fxml"));
        } else if (event.getSource() == addLocationsBtn){
            stage = (Stage) addLocationsBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("LocationAdd.fxml"));
        } else { //if (event.getSource() == removeLocationsBtn){
            stage = (Stage) removeLocationsBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("LocationRemove.fxml"));
        }

        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}