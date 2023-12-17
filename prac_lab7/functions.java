package bank;

public interface functions{
    String credentialCheck(String username,String password) throws Exception;
    String credit(double a) throws Exception;
    String debit(double a) throws Exception;
    String displayBalance() ;
    void exit() ;
}