package Chapter_08;
class Account{
    String name;
    String no;
    long balance;
}
public class AccountTester {
    public static void main(String[] args) {
        Account adachi = new Account();
        Account nakata = new Account();

        adachi.name = "Adachi Koichi";
        adachi.no = "123456";
        adachi.balance = 1000;

        nakata.name = "Nakata Shinji";
        nakata.no = "654321";
        nakata.balance = 200;

        adachi.balance -= 200;
        nakata.balance += 100;

        System.out.println(">>> 아다치의 계좌");
        System.out.println("    계좌명의 : " + adachi.name);
        System.out.println("    계좌변호 : " + adachi.no);
        System.out.println("    예금잔액 : " + adachi.balance);

        System.out.println(">>> 나카타의 계좌");
        System.out.println("    계좌명의 : " + nakata.name);
        System.out.println("    계좌번호 : " + nakata.no);
        System.out.println("    예금잔액 : " + nakata.balance);
    }
}
