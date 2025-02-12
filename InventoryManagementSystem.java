class Inventory {

    private InventoryNode head; 
    private int size; 

    
    class InventoryNode {
        String itemName;
        int itemID;
        int quantity;
        double price;
        InventoryNode next;

        public InventoryNode(String itemName, int itemID, int quantity, double price) {
            this.itemName = itemName;
            this.itemID = itemID;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    
    public void addItemAtBeginning(String itemName, int itemID, int quantity, double price) {
        InventoryNode newItem = new InventoryNode(itemName, itemID, quantity, price);
        newItem.next = head;
        head = newItem;
        size++;
        System.out.println("Item added at the beginning successfully.");
    }

    
    public void addItemAtEnd(String itemName, int itemID, int quantity, double price) {
        InventoryNode newItem = new InventoryNode(itemName, itemID, quantity, price);
        if (head == null) {
            head = newItem;
        } 
        else {
            InventoryNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newItem;
        }
        size++;
        System.out.println("Item added at the end successfully.");
    }

    
    public void addItemAtPosition(String itemName, int itemID, int quantity, double price, int position) {
        if (position == 0) {
            addItemAtBeginning(itemName, itemID, quantity, price);
            return;
        }

        if (position > size) {
            System.out.println("Invalid position!");
            return;
        }

        InventoryNode newItem = new InventoryNode(itemName, itemID, quantity, price);
        InventoryNode prev = getItemAtPosition(position - 1);
        prev.next = newItem;
        newItem.next = prev.next;
        size++;
        System.out.println("Item added at position " + position + " successfully.");
    }

    
    private InventoryNode getItemAtPosition(int position) {
        InventoryNode current = head;
        int currentPosition = 0;
        while (current != null && currentPosition < position) {
            current = current.next;
            currentPosition++;
        }
        return current;
    }

    
    public void removeItemByID(int itemID) {
        if (head == null) {
            System.out.println("Inventory is empty!");
            return;
        }

        if (head.itemID == itemID) {
            head = head.next;
            size--;
            System.out.println("Item with ID " + itemID + " removed successfully.");
            return;
        }

        InventoryNode current = head;
        while (current.next != null && current.next.itemID != itemID) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Item not found!");
            return;
        }

        current.next = current.next.next;
        size--;
        System.out.println("Item with ID " + itemID + " removed successfully.");
    }

    
    public void updateQuantity(int itemID, int newQuantity) {
        InventoryNode current = head;
        while (current != null) {
            if (current.itemID == itemID) {
                current.quantity = newQuantity;
                System.out.println("Quantity updated for Item ID " + itemID);
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found!");
    }

    
    public void searchItemByID(int itemID) {
        InventoryNode current = head;
        while (current != null) {
            if (current.itemID == itemID) {
                System.out.println("Item Name: " + current.itemName);
                System.out.println("Item ID: " + current.itemID);
                System.out.println("Quantity: " + current.quantity);
                System.out.println("Price: Rs. " + current.price);
                System.out.println("--------------------------");
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found!");
    }

    
    public void searchItemByName(String itemName) {
        InventoryNode current = head;
        while (current != null) {
            if (current.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item Name: " + current.itemName);
                System.out.println("Item ID: " + current.itemID);
                System.out.println("Quantity: " + current.quantity);
                System.out.println("Price: Rs. " + current.price);
                System.out.println("--------------------------");
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found!");
    }

    
    public double calculateTotalValue() {
        double totalValue = 0;
        InventoryNode current = head;
        while (current != null) {
            totalValue += current.price * current.quantity;
            current = current.next;
        }
        return totalValue;
    }

    
    public void sortInventoryByName() {
        head = mergeSort(head, "name");
        System.out.println("Inventory sorted by name.");
    }

    
    public void sortInventoryByPrice() {
        head = mergeSort(head, "price");
        System.out.println("Inventory sorted by price.");
    }

    
    private InventoryNode mergeSort(InventoryNode head, String criteria) {
        if (head == null || head.next == null) {
            return head;
        }

        InventoryNode middle = getMiddle(head);
        InventoryNode nextOfMiddle = middle.next;
        middle.next = null; 

        InventoryNode left = mergeSort(head, criteria);
        InventoryNode right = mergeSort(nextOfMiddle, criteria);

        return merge(left, right, criteria);
    }

    
    private InventoryNode merge(InventoryNode left, InventoryNode right, String criteria) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        InventoryNode result;
        if (criteria.equals("name")) {
            if (left.itemName.compareToIgnoreCase(right.itemName) <= 0) {
                result = left;
                result.next = merge(left.next, right, criteria);
            } 
            else {
                result = right;
                result.next = merge(left, right.next, criteria);
            }
        } 
        else { 
            if (left.price <= right.price) {
                result = left;
                result.next = merge(left.next, right, criteria);
            } 
            else {
                result = right;
                result.next = merge(left, right.next, criteria);
            }
        }

        return result;
    }

    
    private InventoryNode getMiddle(InventoryNode head) {
        if (head == null) {
            return head;
        }

        InventoryNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public void displayItemDetails() {
        InventoryNode current = head;
        while (current != null) {
            System.out.println("Item Name: " + current.itemName);
            System.out.println("Item ID: " + current.itemID);
            System.out.println("Quantity: " + current.quantity);
            System.out.println("Price: Rs. " + current.price);
            System.out.println("--------------------------");
            current = current.next;
        }
    }
}


public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addItemAtEnd("Laptop", 101, 5, 70000);
        inventory.addItemAtEnd("Mouse", 102, 20, 500);
        inventory.addItemAtBeginning("Keyboard", 103, 15, 1500);

        System.out.println("Total Inventory Value: Rs. " + inventory.calculateTotalValue());

        inventory.sortInventoryByPrice();
        inventory.searchItemByID(102);

        inventory.updateQuantity(103, 25);
        inventory.removeItemByID(101);


        inventory.displayItemDetails();
    }
}
