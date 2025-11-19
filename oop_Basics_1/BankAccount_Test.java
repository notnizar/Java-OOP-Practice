
public class BankAccount_Test {
    public static void main(String[] args) {
        BankAccount a1 = new  BankAccount(300, 1);
        a1.deposit(50);
        a1.withdraw(20);
        System.out.println(a1.getBalance());
    }
}
