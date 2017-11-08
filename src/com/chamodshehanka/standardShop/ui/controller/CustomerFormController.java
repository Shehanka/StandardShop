package com.chamodshehanka.standardShop.ui.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/3/2017
 * @project StandardShop
 **/
public class CustomerFormController implements Initializable{

    @FXML
    private AnchorPane rootCustomerForm;

    @FXML
    private JFXTextField txtCustomerID;

    @FXML
    private JFXButton btnSearchCustomer;

    @FXML
    private JFXButton btnDeleteCustomer;

    @FXML
    private JFXButton btnAddCustomer;

    @FXML
    private JFXButton btnUpdateCustomer;

    @FXML
    private JFXButton btnClose;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXComboBox<String> cbxGender;

    private ObservableList<String> genderList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadGenderValues();
    }

    private void loadGenderValues(){
        genderList.addAll("Male","Female");
        cbxGender.setItems(genderList);
    }

    @FXML
    private void closeWindowAction(MouseEvent event) {
        Platform.exit();
        rootCustomerForm.getScene().getWindow().hide();
    }
}
