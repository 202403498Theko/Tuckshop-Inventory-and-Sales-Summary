package service;
import model.Product;
import java.util.ArrayList;

public class InventoryService {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully!");
    }

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product p : products) {
            p.display();
        }
    }

    public Product findProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void restockProduct(int id, int quantity) {
        Product p = findProduct(id);

        if (p != null) {
            p.addStock(quantity);
            System.out.println("Restocked successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }
}
