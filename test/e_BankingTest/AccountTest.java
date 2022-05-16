package e_BankingTest;

import e_Banking.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    private Account account;


    @BeforeEach
    public void setUp() {
        account = new Account("remi", "tinubu", "1001", "00", "10001");
    }

    @Test
    public void accountExistsTest() {
        assertNotNull(account);
    }


    @Test
    public void accountHasAccountNumberTest() {
        assertEquals("0110", account.getAccountNumber());
    }


    @Test
    public void testThatAccountCanChangePin(){
        account.changePassword("00", "11", "11");
        account.deposit(200);
        account.withdraw(100, "11");
        assertEquals(100, account.getBalance());
    }
    @Test
    public void accountHasBVNTest() {

        account.setBVN("10001");
        assertEquals("10001", account.getBVN());
    }

    @Test
    public void accountNameContainsFirstNameAndSecondName() {
        account.setFullName("funmi", "omis");
        assertEquals("funmi omis", account.getFullName());
    }

    @Test
    public void accountHasBalance() {

        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void accountCanDeposit() {
        account.deposit(120.10);
        assertEquals(120.10, account.getBalance());
    }

    @Test
    public void accountCanNotDepositNegatives() {
        account.deposit(-120.10);
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void accountCanDepositMultipleTimes() {
        account.deposit(100.00);
        account.deposit(100.00);
        account.deposit(100.00);
        assertEquals(300.0, account.getBalance());

        account.deposit(-100.00);
        assertEquals(300.0, account.getBalance());
    }

    @Test
    public void accountCanWithdraw(){
        account.deposit(100.00);
        account.withdraw(50, "00");
        assertEquals(50, account.getBalance());
    }

    @Test
    public void accountCantWithdrawNegatives(){
        account.deposit(100.00);
        account.withdraw(-50, "00");
        assertEquals(100, account.getBalance());
    }

    @Test
    public void withdrawAmountCantBeGreaterThanBalance(){
        account.deposit(100.00);
        account.withdraw(150, "00");
        assertEquals(100, account.getBalance());
    }

    @Test
    public void wrongPinCantWithdraw(){
        account.deposit(100.00);
        account.withdraw(50, "01");
        assertEquals(100, account.getBalance());
    }

}
