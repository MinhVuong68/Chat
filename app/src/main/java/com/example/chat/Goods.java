package com.example.chat;

public class Goods {
    private int imgGoods;
    private String productName;
    private String nameStore;

    public int getImgGoods() {
        return imgGoods;
    }

    public String getProductName() {
        return productName;
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setImgGoods(int imgGoods) {
        this.imgGoods = imgGoods;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public Goods(int imgGoods, String productName, String nameStore) {
        this.imgGoods = imgGoods;
        this.productName = productName;
        this.nameStore = nameStore;
    }

    public Goods() {
    }
}
