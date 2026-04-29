package model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Methods
    public void addStock(int amount) {
        quantity += amount;
    }

    public void reduceStock(int amount) {
        quantity -= amount;
    }

    public void display() {
        System.out.println(id + " | " + name + " | P" + price + " | Qty: " + quantity);
    }
}
