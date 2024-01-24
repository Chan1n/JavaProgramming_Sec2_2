package labsheett10;

public class Invoice {
      private int id;
      private customer Customer;
      private double amount;
      
      public Invoice(int id , customer Customer , double amount) {
    	  this.id = id;
    	  this.Customer = Customer;
    	  this.amount = amount;
      }
      public int getID() {
    	  return id;
      }
      public customer getCustomer() {
    	  return Customer;
      }
      public void setCustomer(customer Customer) {
    	  this.Customer = Customer;
      }
      public double getAmount() {
    	  return amount;
      }
      public void setAmount(double amount) {
    	  this.amount = amount;
      }
      public int getCustomerID() {
    	  return getCustomer().getID(); 
      }
      public String getcustomerName() {
    	  return getCustomer().getName();
      }
      public int getCustomerDiscount() {
    	  return getCustomer().getDiscount();
      }
      public double getAmountAfterDiscount() {
    	 return getAmount()-(getCustomerDiscount()/100*getAmount());
      }
      public String toString() {
    	  return "Invoice["+this.getID()+",customer =("+this.getcustomerName()+this.getCustomerDiscount()+"+amount = "+this.getAmountAfterDiscount();
      }
}
