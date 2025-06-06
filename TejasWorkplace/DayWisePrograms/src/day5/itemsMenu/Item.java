package day5.itemsMenu;

import java.util.Scanner;

class Item {
    private int itemCode;
    private String itemName;
    private double price;
    private int quantity;

    public Item(int itemCode, String itemName, double price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getItemCode() { return itemCode; }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String toString() {
        return String.format("%-5d %-15s ₹%-8.2f %-5d", 
               itemCode, itemName, price, quantity);
    }
}

class BillingSystem {
    private static Item[] stock = initializeStock();
    private static Item[] cart = new Item[50];
    private static int cartCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            processChoice(choice);
        } while(choice != 4);
        scanner.close();
    }

    private static Item[] initializeStock() {
        return new Item[] {
            new Item(101, "Blue Pen", 12.50, 100),
            new Item(102, "Notebook", 45.00, 50),
            new Item(103, "Stapler", 85.00, 20),
            new Item(104, "Highlighter", 25.00, 75),
            new Item(105, "Calculator", 299.00, 15)
        };
    }

    private static void displayMenu() {
        System.out.println("\n==== Billing System ====");
        System.out.println("1. Display Available Items");
        System.out.println("2. Purchase Item");
        System.out.println("3. Generate Bill");
        System.out.println("4. Exit");
    }

    private static void processChoice(int choice) {
        switch(choice) {
            case 1: displayItems(); break;
            case 2: purchaseItem(); break;
            case 3: generateBill(); break;
            case 4: System.out.println("Thank you!"); break;
            default: System.out.println("Invalid choice!");
        }
    }

    private static void displayItems() {
        System.out.println("\nCode  Name            Price    Qty");
        System.out.println("----------------------------------");
        for(Item item : stock) {
            System.out.println(item);
        }
    }

    private static void purchaseItem() {
        displayItems();
        System.out.print("\nEnter item code: ");
        int code = scanner.nextInt();
        
        Item item = findItem(code);
        if(item == null) {
            System.out.println("Item not found!");
            return;
        }

        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();
        
        if(qty <= 0) {
            System.out.println("Quantity must be positive!");
        } 
        else if(qty > item.getQuantity()) {
            System.out.println("Insufficient stock!");
        } 
        else {
            item.setQuantity(item.getQuantity() - qty);
            cart[cartCount++] = new Item(item.getItemCode(), item.getItemName(), 
                                        item.getPrice(), qty);
            System.out.println("Added to cart: " + item.getItemName());
        }
    }

    private static void generateBill() {
        if(cartCount == 0) {
            System.out.println("\nYour cart is empty!");
            return;
        }

        System.out.println("\n==== Your Bill ====");
        System.out.println("Item            Qty  Price  Subtotal");
        System.out.println("------------------------------------");
        
        double total = 0;
        for(int i = 0; i < cartCount; i++) {
            Item item = cart[i];
            double subtotal = item.getPrice() * item.getQuantity();
            total += subtotal;
            
            System.out.printf("%-15s %-5d ₹%-6.2f ₹%-7.2f\n",
                item.getItemName(),
                item.getQuantity(),
                item.getPrice(),
                subtotal);
        }
        
        System.out.println("------------------------------------");
        System.out.printf("Total: ₹%.2f\n", total);
    }

    private static Item findItem(int code) {
        for(Item item : stock) {
            if(item.getItemCode() == code) {
                return item;
            }
        }
        return null;
    }
}
