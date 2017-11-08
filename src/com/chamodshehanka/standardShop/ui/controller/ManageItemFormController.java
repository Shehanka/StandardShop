package com.chamodshehanka.standardShop.ui.controller;

import com.chamodshehanka.standardShop.tableModel.ItemTableModel;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/3/2017
 * @project StandardShop
 **/

public class ManageItemFormController implements Initializable{

    @FXML
    private JFXTextField txtItemCode;

    @FXML
    private JFXButton btnSearchItem;

    @FXML
    private JFXButton btnDeleteItem;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtQtyOnHand;

    @FXML
    private JFXTextField txtUnitPrice;

    @FXML
    private JFXButton btnAddItem;

    @FXML
    private JFXButton btnUpdateItem;

    @FXML
    private TableView<ItemTableModel> tblItems;

    @FXML
    private TableColumn<ItemTableModel, String> colItemCode;

    @FXML
    private TableColumn<ItemTableModel, String> colDescription;

    @FXML
    private TableColumn<ItemTableModel, Integer> colQtyOnHand;

    @FXML
    private TableColumn<ItemTableModel, Double> colUnitPrice;

    private final ObservableList<ItemTableModel> data = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadTableCells();
    }

    @FXML
    private void addItem(ActionEvent event){

        ItemTableModel row = new ItemTableModel(
                txtItemCode.getText(),
                txtDescription.getText(),
                Integer.parseInt(txtQtyOnHand.getText()),
                Double.parseDouble(txtUnitPrice.getText())
        );
        data.add(row);

    }

    @FXML
    private void searchItem(ActionEvent event) {

    }

    @FXML
    private void updateItem(ActionEvent event){

    }

    @FXML
    private void deleteItem(ActionEvent event){

    }

    private void loadTableCells(){
        colItemCode.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colQtyOnHand.setCellValueFactory(new PropertyValueFactory<>("qtyOnHand"));
        colUnitPrice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));

        tblItems.setItems(data);
    }
}
