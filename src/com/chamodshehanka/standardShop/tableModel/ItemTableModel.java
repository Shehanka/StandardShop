package com.chamodshehanka.standardShop.tableModel;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author chamodshehanka on 11/4/2017
 * @project StandardShop
 **/
public class ItemTableModel {
    private SimpleStringProperty itemCode = new SimpleStringProperty("");
    private SimpleStringProperty description = new SimpleStringProperty("");
    private SimpleIntegerProperty qtyOnHand = new SimpleIntegerProperty(0);
    private SimpleDoubleProperty unitPrice = new SimpleDoubleProperty(0.0);

    public ItemTableModel() {
    }

    public ItemTableModel(SimpleStringProperty itemCode, SimpleStringProperty description, SimpleIntegerProperty qtyOnHand, SimpleDoubleProperty unitPrice) {
        this.itemCode.set(String.valueOf(itemCode));
        this.description.set(String.valueOf(description));
        this.qtyOnHand =qtyOnHand;
        this.unitPrice = unitPrice;
    }

    public ItemTableModel(String itemCode, String description, int qtyOnHand, double unitPrice) {
        this.itemCode.set(itemCode);
        this.description.set(description);
        this.qtyOnHand.set(qtyOnHand);
        this.unitPrice.set(unitPrice);
    }

    public String getItemCode() {
        return itemCode.get();
    }

    public SimpleStringProperty itemCodeProperty() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode.set(itemCode);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public int getQtyOnHand() {
        return qtyOnHand.get();
    }

    public SimpleIntegerProperty qtyOnHandProperty() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand.set(qtyOnHand);
    }

    public double getUnitPrice() {
        return unitPrice.get();
    }

    public SimpleDoubleProperty unitPriceProperty() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice.set(unitPrice);
    }
}
