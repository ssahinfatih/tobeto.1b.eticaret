package org.example;

import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {


        User user1 = new User("Fa2h","Şahin", 10000);
        User user2 = new User("Ahmet","Kara", 4000);


        Product product1= new Product(0,"Laptop",32750);
        Product product2= new Product(1,"Klavye",2100);

        Category category1= new Category(0,"Teknoloji");
        Category category2= new Category( 1,"Aksesuar");

        Order order1= new Order(0,1,"aaaaaa");
        Order order2=new Order(1,2,"bbbbb");


        user1.setFirstName("Fatih");
        product1.setUnitPrice(30000);

        Product[] products={product1,product2};

        for (Product product:products) {
            System.out.println("Ürün adı "+ product.getProductName() + " -- " + "ürün fiyatı = " + product.getUnitPrice());
        }










    }
}