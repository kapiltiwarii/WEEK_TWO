public class Item {
    String itemCode;
    String itemName;
    int price;

    Item(String itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void display(int quantity) {
        System.out.println("Item Code :" + itemCode);
        System.out.println("Item Name :" + itemName);
        System.out.println("Item Price :" + price);
        System.out.println("Total Cost :" + quantity * price);
    }

    public static void main(String[] args) {
        Item resuItem = new Item("I-1", "Rice", 50);
        resuItem.display(4);
    }
}
