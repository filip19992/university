package pl.filipwlodarczyk.inheritance.ex6;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(0, 2.5);
        SavingAccount savingAccount2 = new SavingAccount(1000, 2.5);

        savingAccount.deposit(200);

        System.out.println(savingAccount.getBalance());

        savingAccount.withdraw(50);

        System.out.println(savingAccount.getBalance());

        savingAccount.transfer(70, savingAccount2);

        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount2.getBalance());

        System.out.println(savingAccount.toString());
        System.out.println(savingAccount2.toString());

    }
}
