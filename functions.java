package bank;

 public interface functions{
    String credentialsCheck(String username,String password) throws Exception;
    String credit(double amount) throws Exception;
    String debit(double amount)throws Exception;
    double displayBalance();
    String exit();
}