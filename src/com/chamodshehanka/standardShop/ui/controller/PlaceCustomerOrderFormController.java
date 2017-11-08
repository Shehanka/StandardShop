package com.chamodshehanka.standardShop.ui.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/3/2017
 * @project StandardShop
 **/

public class PlaceCustomerOrderFormController implements Initializable{

    @FXML
    private AnchorPane rootPlaceOrder;

    @FXML
    private JFXComboBox<String> cbxCustomerID;

    @FXML
    private JFXButton btnAddCustomer;

    @FXML
    private JFXTextField txtOrderID;

    @FXML
    private JFXTextField txtCustomerName;

    @FXML
    private JFXDatePicker txtOrderDate;

    @FXML
    private JFXComboBox<String> cbxItemCode;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtQtyOnHand;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXTextField txtUnitPrice;

    @FXML
    private TableView<?> tblOrder;

    @FXML
    private TableColumn<?, ?> colItemCode;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colUnitPrice;

    @FXML
    private TableColumn<?, ?> colAmount;

    @FXML
    private JFXTextField txtTotalAmount;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnRemoveItem;

    @FXML
    private JFXButton btnHome;


    private double xOffset = 0;

    private double yOffset = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setBtnHomeBackground();
    }

    @FXML
    private void gotoMainMenu(ActionEvent event) {
        try {
            AnchorPane mainMenuPane=FXMLLoader.load(
                    getClass().getResource("/com/chamodshehanka/standardShop/ui/fxml/MainMenuForm.fxml")
            );

            rootPlaceOrder.getChildren().setAll(mainMenuPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void addCustomerAction(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/com/chamodshehanka/standardShop/ui/fxml/CustomerForm.fxml")
        );
        Parent root1;
        try {
            root1 = fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("Manage Customer");
            stage.getIcons().add(new Image(getClass().getResourceAsStream(
                    "/com/chamodshehanka/standardShop/ui/icon/icon.png"
            )));

            root1.setOnMousePressed(event -> {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            });

            root1.setOnMouseDragged(event -> {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            });

            Scene scene=new Scene(root1);
            scene.setFill(Color.TRANSPARENT);
            stage.setScene(scene);
            stage.initStyle(StageStyle.TRANSPARENT);
            ((Node)(actionEvent.getSource())).getScene().getWindow();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setBtnHomeBackground(){
        BackgroundImage backgroundImage = new BackgroundImage(
                new Image( getClass().getResource("/com/chamodshehanka/standardShop/ui/images/home.png")
                        .toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT
        );
        Background background = new Background(backgroundImage);
        btnHome.setBackground(background);
    }
}
