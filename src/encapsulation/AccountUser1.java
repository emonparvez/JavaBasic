
package encapsulation;


public class AccountUser1 {
    
    
    public static void main(String[] args) {
        
        
        Account1 acc=new Account1();
        
        
        acc.setAccount_no(100003);
        acc.setName("Akash Ahmed");
        acc.setEmail_id("akash001ahmed@gmail.com");
        acc.setAmount(60000);
        
        
        
        long account_no=acc.getAccount_no();
        String name=acc.getName();
        String email_id=acc.getEmail_id();
        float amount=acc.getAmount();
        
         
        
        System.out.println("Account No is : " + account_no);
        System.out.println("Name is : " + name);
        System.out.println("Email is : " + email_id);
        System.out.println("Amount is : " + amount);
        
        
        
        
        
        
        
    }
}
