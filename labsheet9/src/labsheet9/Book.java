package labsheet9;

import java.time.Year;

public class Book {
      private String title;
      private float price;
      private int publishyear;
      
      public void setTitle(String title) {
    	  this.title = title;
    	  this.price = price;
    	  this.publishyear = publishyear;
      }
      public String getTitle() {
    	  return this.title;
      }
      public void setPrice(float price) {
    	  this.price = price;
      }
      public float getPrice() {
    	  return this.price;
      }
      public void setPublishyear(int publishyear) {
    	  this.publishyear = publishyear;
      }
      public int getPublishyear() {
    	  return this.publishyear;
      }
      public int getTotalYear() {
    	  return Year.now().getValue()-publishyear;
    	  
      }
      public String toString() {
    	  return "title: "+title+" publish for "+getTotalYear()+"year ("+price+"baht)";
      }
}

