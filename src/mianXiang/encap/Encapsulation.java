package mianXiang.encap;

public class Encapsulation {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(60);
        account.setPwd("123456");
        System.out.println(account.getName());

        account.showInfo();
    }

}
