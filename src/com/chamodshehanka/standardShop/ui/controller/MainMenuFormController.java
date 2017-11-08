package com.chamodshehanka.standardShop.ui.controller;

import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 10/30/2017
 * @project StandardShop
 **/

public class MainMenuFormController implements Initializable{

    @FXML
    private AnchorPane rootStandardShop;

    @FXML
    private ImageView imgClose;

    @FXML
    private JFXButton btnPlaceCustomerOrder;

    @FXML
    private JFXButton btnManageItem;

    @FXML
    private JFXButton btnModifyOrders;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void btnPlaceCustomerOrderAction(ActionEvent event) {

        try {
            AnchorPane placeOrderPane= FXMLLoader.load(
                    getClass().getResource("/com/chamodshehanka/standardShop/ui/fxml/PlaceCustomerOrderForm.fxml")
            );
            rootStandardShop.getChildren().setAll(placeOrderPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnManageItemAction(ActionEvent actionEvent){
        try {
            AnchorPane manageItemPane=FXMLLoader.load(getClass().getResource(
               "/com/chamodshehanka/standardShop/ui/fxml/ManageItemForm.fxml"
            ));
            rootStandardShop.getChildren().setAll(manageItemPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnModifyOrdersAction(){
        try {
            AnchorPane modifyOrdersPane=FXMLLoader.load(getClass().getResource(
                    "/com/chamodshehanka/standardShop/ui/fxml/ModifyOrdersForm.fxml"
            ));
            rootStandardShop.getChildren().setAll(modifyOrdersPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void closeWindowAction(MouseEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add(
                getClass().getResource("/com/chamodshehanka/standardShop/ui/css/DialogStyle.css").toExternalForm());
        dialogPane.getStyleClass().add("myDialog");
        alert.setTitle("Closing Dialog");
        alert.setHeaderText("Look, a Closing Dialog");
        alert.setContentText("Are you ok with this?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            Platform.exit();
        }
    }
}
