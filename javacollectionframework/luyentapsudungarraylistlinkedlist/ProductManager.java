package luyentapsudungarraylistlinkedlist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {

    private List<Product> products = new ArrayList<Product>();

    //add
    public void addProduct(Product product) {
        products.add(product);
    }

    //update theo id
    public boolean updateProduct(int newId, String newName, double newPrice) {
        for (Product product : products) {
            if (product.getId() == newId) {
                product.setName(newName);
                product.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    //xoa
    public boolean deleteProduct(int id) {
        return products.removeIf(products -> products.getId() == id);
    }

    //hienthi
    public void DisplayProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public void searchProduct(int id) {
        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có chứa tên: " + id);
        }
    }

    public void sortByPriceAscending() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Sắp xếp tăng dần theo giá.");
    }

    public void sortByPriceDescending() {
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        System.out.println("Sắp xếp giảm dần theo giá");
    }
}
