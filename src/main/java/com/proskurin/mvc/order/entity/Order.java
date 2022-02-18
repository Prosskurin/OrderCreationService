package com.proskurin.mvc.order.entity;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "price")
    private double price;

    @Column(name = "currency")
    private final String currency = "RUR";

    @Column(name = "producttype")
    private String productType;

    @Column(name = "signeddocuments")
    private String signedDocuments;

    @Column(name = "comission")
    private double comission;

    public Order(double price, String productType, String signedDocuments) {
        this.price = price;
        this.productType = productType;
        this.signedDocuments = signedDocuments;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSignedDocuments() {
        return signedDocuments;
    }

    public void setSignedDocuments(String signedDocuments) {
        this.signedDocuments = signedDocuments;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }


    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", currency='" + currency + '\'' +
                ", productType='" + productType + '\'' +
                ", signedDocuments='" + signedDocuments + '\'' +
                '}';
    }


}
