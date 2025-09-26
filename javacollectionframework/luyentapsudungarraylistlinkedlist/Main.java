package luyentapsudungarraylistlinkedlist;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("-_-_-MENU-_-_-");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Sửa thông tin theo sản phẩm theo id.");
            System.out.println("3. Xoá sản phẩm theo id.");
            System.out.println("4. Hiển thị danh sách theo sản phẩm.");
            System.out.println("5. Tìm kiếm sản phẩm theo tên.");
            System.out.println("6. Sắp xếp sane phẩm tăng dần.");
            System.out.println("7. Sắp xếp sản phẩm giảm dần.");
            System.out.println("0. Thoát chương trình");
            System.out.println("Chọn trương trình");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // bỏ ký tự xuống dòng
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    manager.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.print("Nhập ID sản phẩm cần sửa: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double newPrice = scanner.nextDouble();
                    boolean updated = manager.updateProduct(updateId, newName, newPrice);
                    System.out.println(updated ? "Cập nhật thành công." : "Không tìm thấy sản phẩm.");
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    int deleteId = scanner.nextInt();
                    boolean deleted = manager.deleteProduct(deleteId);
                    System.out.println(deleted ? "Xóa thành công." : "Không tìm thấy sản phẩm.");
                    break;
                case 4:
                    manager.DisplayProducts();
                    break;
                case 5:
                    System.out.print("Nhập ID sản phẩm cần tìm: ");
                    int searchId = scanner.nextInt();
                    manager.searchProduct(searchId);
                    break;
                case 6:
                    manager.sortByPriceAscending();
                    manager.DisplayProducts();
                    break;
                case 7:
                    manager.sortByPriceDescending();
                    manager.DisplayProducts();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
