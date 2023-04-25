package Chapter_08;
class Account {
    private String name;
    private String no;
    private long balance;

    Account(String n, String num, long z) {
        name = n;
        no = num;
        balance = z;
    }
    String getName() {
        return name;
    }
    String getNo() {
        return no;
    }
    long getBalance() {
        return balance;
    }
    void deposit(long k) {
        balance += k;
    }
    void withdraw(long k) {
        balance -= k;
    }
}
public class AccountTeseter {
    public static void main(String[] args) {
        Account adachi = new Account("아다치 코이치", "123456", 1000);
        Account nakata = new Account("나카타 신지", "654321", 200);

        adachi.withdraw(200);
        nakata.deposit(100);

        System.out.println("아다치의 구좌");
        System.out.println("    계좌명의 : " + adachi.getName());
        System.out.println("    계좌번호 : " + adachi.getNo());
        System.out.println("    예금잔액 : " + adachi.getBalance());

        System.out.println("나카타의 구좌");
        System.out.println("    계좌명의 : " + nakata.getName());
        System.out.println("    계좌번호 : " + nakata.getNo());
        System.out.println("    예금잔액 : " + nakata.getBalance());
    }
}
