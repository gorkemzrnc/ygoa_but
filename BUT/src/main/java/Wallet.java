public class Wallet {
    private double balance = 0;
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Tl "+ "bakiye eklendi");
        System.out.println("Mevcut bakiye: " + balance);
        System.out.println();
    }
    
    public void spend(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " miktar harcandı.");
            System.out.println("Kalan miktar: "+ balance);
            System.out.println();
        } else {
            System.out.println("Yetersiz bakiye");
            System.out.println();
        }
    }
    
    public double getBalance() {
        return balance;
    }
}