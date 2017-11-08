package com.chamodshehanka.standardShop.ui.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/3/2017
 * @project StandardShop
 **/

public class ModifyOrdersFormController implements Initializable{

    @FXML
    private AnchorPane rootModifyOrder;

    @FXML
    private JFXComboBox<String> cbxCustomerID;

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


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
