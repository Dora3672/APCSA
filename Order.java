public class Order{

   private String name;
   private int number, quantity;
   private double price, total;
   
   public Order (String n, int num, int q, double p) {
      name = n;
      number = num;
      quantity = q;
      pric e = p;
   }
   
   public String getName () {
      return name;
   }
   
   public int getNumber () {
      return number;
   }
   
   public int getQuantity () {
      return quantity;
   }
   
   public double getPrice () {
      return price;
   }
   
   public void setName (String newName) {
      name = newName;
   }
   
   public void setNumber (int newNum) {
      number = newNum;
   }
   
   public void setQuantity (int newQuantity) {
      quantity = newQuantity;
   }
   
   public void setPrice (double newPrice) {
      price = newPrice;
   }
   
   public double computePrice () {
      return quantity * price;
   }
   
   public String toString () {
      return "Customer Name: " + name +
             "\nCustomer Number " + number +
             "\nQuantity Ordered: " + quantity +
             "\nUnit Price: " + price +
             "\nTotal Price: " + quantity * price;
   }
   
   public boolean equals (Order other) {
      if (other.computePrice() == price) {
         return true;
      }
      else{
         return false;
      }
   }
   

}