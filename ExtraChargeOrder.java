 /******************************************************************************
Name: Dora Ding
Name of Lab: ExtraChargeORder
Due Date: 06/20/2022
Date Submitted: 06/20/2022
What I learned:
   a. I learned how to use inheritance.
*******************************************************************************/

public class ExtraChargeOrder extends Order {

   private double total;
   
   public ExtraChargeOrder (String n, int num, int q, double p) {
      super(n, num, q, p);
      total = computePrice();
   }

   public String toString () {
      return super.toString();
   }
   
   public boolean equals (Order other) {
      return super.equals(other);
   }
   
   public double computePrice () {
      return (super.getPrice() * super.getQuantity()) + 4;
   }
   
   
   public double setTotal (double t) {
      total = t;
      return total;
   }   

   public static void main (String [] args) {
      Order a = new Order("Dora", 123, 9, 63.00);
      Order b = new ExtraChargeOrder("Dora", 123, 9, 63.00);
      b.setTotal(b.computePrice());
      System.out.println(a + "\n");
      System.out.println(b + "\n");
      System.out.println("It is " + a.equals(b) + " that the two orders are equal.");
      double difference = b.computePrice() - a.computePrice();
      System.out.println("The extra charge order has $" + difference + " higher than the original order.");
   }

}

/*
  ----jGRASP exec: java ExtraChargeOrder
 Customer Name: Dora
 Customer Number 123
 Quantity Ordered: 9
 Unit Price: 63.0
 Total Price: 567.0
 
 Customer Name: Dora
 Customer Number 123
 Quantity Ordered: 9
 Unit Price: 63.0
 Total Price: 571.0
 
 It is false that the two orders are equal.
 The extra charge order has $4.0 higher than the original order.
 
  ----jGRASP: operation complete.
  */