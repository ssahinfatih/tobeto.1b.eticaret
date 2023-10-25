package org.example;

public class Order {

    private  int id;
    private  int total;

    private String comment;

    public Order(int id, int total, String comment) {
        this.id = id;
        this.total = total;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
