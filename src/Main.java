//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account a1 = new Account();
        a1.insert(4451238 , "Mohammed",10000);
        a1.deposit(12000);
        a1.withdraw(2000);
        a1.checkBalance();
        System.out.println(a1.toString());

        System.out.println("/********************************************************/");

        Account a2 = new Account();
        a2.insert(3633455 , "Azo Ismail",44000);
        a2.deposit(65000);
        a2.withdraw(120000);
        a2.checkBalance();
        System.out.println(a2.toString());

        System.out.println("/********************************************************/");

        Account a3 = new Account();
        a3.insert(5467230 , "Edip",348733);
        a3.deposit(12000);
        a3.withdraw(2000);
        a3.checkBalance();
        System.out.println(a3.toString());




    }
}