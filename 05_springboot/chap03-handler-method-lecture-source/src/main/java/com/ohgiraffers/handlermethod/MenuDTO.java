package com.ohgiraffers.handlermethod;

public class MenuDTO {
    private String name;
    private int price;
    private int categorCode;
    private String orderableStatus;

    public MenuDTO() {
    }

    public MenuDTO(String name, int price, int categorCode, String orderableStatus) {
        this.name = name;
        this.price = price;
        this.categorCode = categorCode;
        this.orderableStatus = orderableStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategorCode() {
        return categorCode;
    }

    public void setCategorCode(int categorCode) {
        this.categorCode = categorCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categorCode=" + categorCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
