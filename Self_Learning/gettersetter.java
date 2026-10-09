package Self_Learning;
class bank{
    private String name;
    private int balance;
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getBalance() {
    return balance;
}

public void setBalance(int balance) {
    this.balance = balance;
}
}
public class gettersetter {
    public static void main(String[] args) {
       bank b = new bank();
       b.setName("Shubham");
       b.setBalance(560000);
        System.out.println("Balance : " + b.getBalance());
        System.out.println("Name : " + b.getName());
        b.setBalance(4800);
        System.out.println(b.getBalance());
    }
}


