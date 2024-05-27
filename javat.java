import java.util.*; 
class Bank
{ 
int accno; 
int amount=0; 
String name;
void insert(int ac,int am,String nm)
{
accno = ac; 
amount = am; 
name = nm; 
}
void deposit (int dd)
{
amount = amount + dd;
}

void withdraw(int ww)
{
if(ww<=amount)
{
amount = amount - ww;
}
else
{
System.out.println("You don't have enough balance !");
}
}
void check()
{
System.out.println("Current balance in your account is : " + amount);
}
void display()
{
System.out.println("Account holder name :  " + name); 
System.out.println("Account number : " + accno); 
System.out.println("Total balance in your account :  " + amount);
}
public static void main(String [] args)
{
System.out.println("---- WELCOME TO BANK ----"); 
Bank sbi = new Bank(); 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the account details :  "); 
System.out.println("1 ) Account Number "); 
Integer ac=sc.nextInt(); 
System.out.println("2 ) Total Amount in account " ); 
Integer am = sc.nextInt(); 
sc.nextLine(); 
System.out.println("3 ) Name of account holder "); 
String nm = sc.nextLine(); 
sbi.insert(ac,am,nm);
 int ch; 
 do { 
            System.out.println("1 ) Deposit money to your account       2 ) Withdraw 
money from account         3 ) Check the balance of your account      " + 
                    " 4 ) Display the content of account   "); 
             ch = sc.nextInt(); 
            switch (ch) { 
                case 1: 
                    System.out.println("Enter the amount you want to deposit into your 
bank account : "); 
                    int dd = sc.nextInt(); 
                    sbi.deposit(dd); 
                    break; 
                case 2: 
                System.out.println("Enter the amount you want to withdraw : "); 
                    int ww = sc.nextInt(); 
                    sbi.withdraw(ww); 
                    break; 
                case 3: 
                    sbi.check(); 
                    break; 
                case 4: 
                    sbi.display(); 
                    break; 
default: 
System.out.println("!!Please enter  right choice !!"); 
break; 
} 
}while(ch!=0); 
}
}