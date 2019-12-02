
package encapsulation;


public class Account_user {
    
    
    public static void main(String[] args) {
        
        Account acc=new Account();
        
        
        acc.setAccount_no(100001);
        acc.setName("Akash");
        acc.setEmail_id("akash001@gmail.com");
        acc.setAmount(50000);
        
        
        
        System.out.println("Account No is : " + acc.getAccount_no());
        System.out.println("Name is : " + acc.getName());
        System.out.println("Email is : " + acc.getEmail_id());
        System.out.println("Amount is : " + acc.getAmount());
        
        
        
    }
    
}
