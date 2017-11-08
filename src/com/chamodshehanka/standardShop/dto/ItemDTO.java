package com.chamodshehanka.standardShop.dto;

/**
 * @author chamodshehanka on 10/30/2017
 * @project StandardShop
 **/
public class ItemDTO {
    private int itemCode;
    private String itemDescription;
    private double unitPrice;
    private int qtyOnHand;

    public ItemDTO() {
    }

    public ItemDTO(int itemCode, String itemDescription, double unitPrice, int qtyOnHand) {
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    public ItemDTO(String itemDescription, double unitPrice, int qtyOnHand) {
        this.itemDescription = itemDescription;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "itemCode=" + itemCode +
                ", itemDescription='" + itemDescription + '\'' +
                ", unitPrice=" + unitPrice +
                ", qtyOnHand=" + qtyOnHand +
                '}';
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
}
