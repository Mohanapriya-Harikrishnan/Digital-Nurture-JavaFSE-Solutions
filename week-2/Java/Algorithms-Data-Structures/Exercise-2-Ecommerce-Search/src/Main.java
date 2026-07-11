public class Main {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics", 65000),
            new Product(102, "Mobile", "Electronics", 30000),
            new Product(103, "Keyboard", "Accessories", 1500),
            new Product(104, "Mouse", "Accessories", 700),
            new Product(105, "Monitor", "Electronics", 12000)
        };

        Product result = SearchService.linearSearch(products, 104);

        if (result != null) {
            System.out.println("Product Found!");
            System.out.println("ID: " + result.productId);
            System.out.println("Name: " + result.productName);
            System.out.println("Category: " + result.category);
            System.out.println("Price: ₹" + result.price);
        } else {
            System.out.println("Product Not Found!");
        }
    }
}