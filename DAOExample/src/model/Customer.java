package model;

//POJO Plain old java object
public class Customer  {
   private int id;
   private String email;
   private String fname;
   private String lname;
 
   public Customer() {}
   public  Customer(int id, String email, String fname, String lname) {
       this.id=id;
       this.email=email;
       this.fname=fname;
       this.lname=lname;
   }
   
   // getter setter methods
   public int getID() {
       return id;
   }

   public void setId(int id) {
       this.id=id;
   }

   public String getEmail() {
       return email;
   }
   
   public void setEmail(String email) {
       this.email=email;
   }


   public String getFname() {
       return fname;
   }
   public void setFname(String fname) {
       this.fname=fname;
   }

   public String getLname() {
       return lname;
   }

   public void setLname(String lname) {
       this.lname=lname;
   }
}