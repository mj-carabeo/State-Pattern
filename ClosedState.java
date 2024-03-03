public class ClosedState implements AccountState{
    @Override
    public void deposit(double depositAmount, Account account) {
        System.out.println("You cannot deposit on a closed account!");
        System.out.println(account.toString());
    };

    @Override
    public void withdraw(double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw on a closed account!");
        System.out.println(account.toString());
    };

    @Override
    public void activate(Account account) {
        System.out.println("You cannot activate a closed account!\n");
    };

    @Override
    public void suspend(Account account) {
        System.out.println("You cannot suspend a closed account!\n");
    };

    @Override
    public void close(Account account) {
        System.out.println("Account is already closed!\n");
    };
}
