package e_BankingTest;

import e_Banking.Account;
import e_Banking.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private Bank bank;

    @BeforeEach
    public void setUp(){
        bank = new Bank("Polaris Bank");
    }

    @Test
    public void testHasBankExist() {
        assertNotNull(bank);
    }

    @Test
    public void testThatBankHasName() {

        assertEquals("Polaris Bank", bank.getBankName());
    }

    @Test
    public void numberOfCustomers() {
        assertEquals(0, bank.getNumberOfCustomers());
    }

    @Test
    public void testThatBankCanCreateAccount() {

        bank.createAccount("joe", "boy", "00", "12345");
        assertEquals(1, bank.getNumberOfCustomers());
    }

    @Test
    public void testThatBankCanCreateMultipleAccounts(){
        bank.createAccount("taiye", "taiwo","90","54321");
        bank.createAccount("taiye", "kehinde","88","98765");
        bank.createAccount("taiye", "idowu","77","01234");
        assertEquals(3, bank.getNumberOfCustomers());
    }

    @Test
    public void testThatBankCanCloseAccount(){
        bank.createAccount("taiye", "taiwo","90","54321");
        assertEquals(1, bank.getNumberOfCustomers());
        boolean status = bank.closeAccount("1", "54321");
        assertTrue(status);
        assertEquals(0, bank.getNumberOfCustomers());
    }

    @Test
    public void testThatAccountCanBeFound(){
        bank.createAccount("taiye", "taiwo","90","54321");
        bank.createAccount("taiye", "kehinde","88","98765");
        bank.createAccount("taiye", "idowu","77","01234");
        assertEquals(3, bank.getNumberOfCustomers());

        Account found = bank.findAccount(1);
        assertEquals("taiye taiwo", found.getFullName());
    }

    @Test
    public void testThatBankCanDeposit(){
        bank.createAccount("taiye", "taiwo","90","54321");
        assertEquals(1, bank.getNumberOfCustomers());

        bank.deposit(100, "1");
        assertEquals(100, bank.checkBalanceOf("1"));


    }

    @Test
    public void testThatBankCanTransfer(){
        bank.createAccount("taiye", "taiwo","90","54321");
        bank.createAccount("taiye", "kehinde","88","98765");
        bank.createAccount("taiye", "idowu","77","01234");
        assertEquals(3, bank.getNumberOfCustomers());

        bank.deposit(1000, "1");
        assertEquals(1000, bank.checkBalanceOf("1"));
        assertEquals(0, bank.checkBalanceOf("2"));
        bank.transfer(500,"1", "2", "90");
        assertEquals(500, bank.checkBalanceOf("2"));
        assertEquals(500, bank.checkBalanceOf("1"));
    }

    @Test
    public void testThatBankCanWithdraw(){
        bank.createAccount("taiye", "taiwo","90","54321");
        bank.deposit(1000, "1");
        bank.withdrawFrom("1", 500, "90");
        assertEquals(500, bank.checkBalanceOf("1"));
    }

    @Test
    public void testThatBankCanResetPassWord(){
        bank.createAccount("taiye", "taiwo","90","54321");
        bank.resetPassword("1","90", "00", "00");
        bank.deposit(3000, "1");
        bank.withdrawFrom("1", 1000, "00");
        assertEquals(2000, bank.checkBalanceOf("1"));


    }

}