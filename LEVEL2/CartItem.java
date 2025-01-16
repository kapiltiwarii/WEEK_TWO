package LEVEL2;

public class CartItem {
    String itemName;
    double price;
    int quantity;
    double cost=00.00;
   
    public double AddItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
        cost=cost+quantity*price;
return cost;
    }
    public double RemoveItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
         cost=cost-quantity*price;
return cost;
    }
    public void TotalCost(){
        System.out.println("Total coat "+cost);
    }
    public static void main(String[] args) {
        CartItem obj=new CartItem();
        obj.AddItem("phone", 100000, 4);
        obj.RemoveItem("phone", 100000, 2);
        obj.TotalCost();
    }
}
