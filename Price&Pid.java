//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Product {
        int pid;
        double price;
        int quantity;

        public Product(int pid, double price, int quantity) {
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }
    }

    class XYZ {
        public static void main(String[] args) {
            Product[] products = new Product[5];

            // Accept five product information and store in array
            for (int i = 0; i < 5; i++) {
                // Get input
                int pid = 20;
                double price = 60;
                int quantity = 10;

                // Create a new Product object and store
                products[i] = new Product(pid, price, quantity);
            }

            // Find Pid of the product
            int highestPricePid = products[0].pid;
            double highestPrice = products[0].price;
            for (int i = 1; i < 5; i++) {
                if (products[i].price > highestPrice) {
                    highestPricePid = products[i].pid;
                    highestPrice = products[i].price;
                }
            }

            // Calculate and return the total amount spent on products
            double totalAmountSpent = calculateTotalAmountSpent(products);
            System.out.println("Total amount spent on all products: " + totalAmountSpent);
        }

        public static double calculateTotalAmountSpent(Product[] products) {
            double totalAmountSpent = 0;
            for (Product product : products) {
                totalAmountSpent += product.price * product.quantity;
            }
            return totalAmountSpent;
        }
    }