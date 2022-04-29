
public class Bank {

	int account_number;
    String name;
    String account_type;
    double balance;
   
    public int getAccount_number() {
        return account_number;
    }
   
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
   
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
   
    public String getAccount_type() {
        return account_type;
    }
   
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
   
    public double getBalance() {
       
        if( balance <1000)
        {
        try
        {   
            throw new NumberFormatException();
        }
        catch(NumberFormatException nw)
        {
            System.out.println("Balance is low"+balance);
        }
        }
       
        return balance;
       
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank() {
       
        this.account_number = 1;
        this.name = "User";
        this.account_type = "Saving";
        this.balance = 500;
    }
   
   
    public Bank(int account_number, String name, String account_type,
            double balance) {
       
        this.account_number = account_number;
        this.name = name;
        this.account_type = account_type;
        this.balance = balance;
    }
    void deposit(double amt)
    {
        if(amt<0)
        {
            try
            {
                throw new NumberFormatException();
            }
            catch(NumberFormatException nf)
            {
                System.out.println("Negaive Amount cant be deposited");
            }
        }
        else
        {
            balance=getBalance()+amt;
            System.out.println("Current balance is ="+balance);
           
        }
       
    }
     public void withdraw(double amt){
         if(amt>1000)
            {
                try
                {
                    throw new NumberFormatException();
                }
                catch(NumberFormatException nf)
                {
                    System.out.println("WE CANT withdraw AMOUNT INSUFFICENT BALANCE ");
                }
            }
            else
            {
                balance=getBalance()-amt;
                System.out.println("Current balance is ="+balance);
               
            }
       
    }
     void display()
     {
    System.out.println("Balance is ="+getBalance());   
     }
   
    public static void main(String[] args) {
       
       
        Bank b=new Bank();
        b.deposit(2000);
        b.display();
        b.withdraw(500);
        b.display();
        b.withdraw(1000);
        b.getBalance();
        b.display();

	}

}
