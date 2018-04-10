/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import cupcakesjavafx.CupCakesJavaFx;
import entity.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author ding
 */
public class ProfileController implements Initializable {

    @FXML
    private JFXTextField usernameField;
    @FXML
    private JFXPasswordField passwordField;
    @FXML
    private Label idLabel;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXTextField phone;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        User curr = CupCakesJavaFx.loggedUser;
        usernameField.setEditable(false);
        usernameField.setText(curr.getUsername());
        email.setText(curr.getEmail());
        phone.setText(curr.getPhone());

        // TODO
    }

    @FXML
    private void simpanClicked(ActionEvent event) {
    }

}
