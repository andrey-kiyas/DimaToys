package com.dimatoys.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class MyOrder {

    @Id
    private String title;
    private Integer price;

    public MyOrder() {
    }

    public MyOrder(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyOrder myOrder = (MyOrder) o;
        return Objects.equals(title, myOrder.title) &&
                Objects.equals(price, myOrder.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
