package CollectionClass;

import java.util.ArrayList;

public class GroceryShop {
    int productId;
    String productName;
    double price;
    String qty;

    public GroceryShop(int productId, String productName, double price, String qty) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.qty = qty;
    }
//
//    public int getProductId() {
//        return productId;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public String getQty() {
//        return qty;
//    }

    public static ArrayList<GroceryShop> storeProduct() {

        ArrayList<GroceryShop> items = new ArrayList<>();
        items.add(new GroceryShop(101, "Sugar", 5, "2 KG"));
        items.add(new GroceryShop(102, "Biscuit", 3, "1 packet"));
        items.add(new GroceryShop(103, "Milk", 7.5, "2 Lr"));
        items.add(new GroceryShop(104, "Salt", 2.5, "2 KG"));
        items.add(new GroceryShop(105, "Cake", 7, "3 pcs"));
        return items;
    }

    public static void main(String[] args) {
        ArrayList<GroceryShop> groceryItems = storeProduct();
        findProduct(groceryItems, 101);
        findProduct(groceryItems, 115);
    }

    public static void findProduct(ArrayList<GroceryShop> items, int productId){
        boolean found = false;
        //ArrayList<GroceryShop> groceryItems = storeProduct();
        for(int i=0;i<items.size();i++){
            if(items.get(i) != null && items.get(i).productId == productId){
                found = true;
                System.out.println("Product found");
                System.out.println("Product name = " +items.get(i).productName);
                System.out.println("Price = " +items.get(i).price);
                System.out.println("Quantity = " +items.get(i).qty);
                break;
            }
        }
        if(!found){
            System.out.println("Product ID not found");
        }
    }
}
