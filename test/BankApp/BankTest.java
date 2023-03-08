package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank gtBank;

    @BeforeEach
    public void startWithThis(){
        gtBank = new Bank("Guarantee Trust");
        gtBank.createAccountFor("Inem", "1234");

    }

    @Test
    public void createAccount(){
        assertEquals(1, gtBank.countNumberOfAccount());
    }

    @Test
    public void checkBalanceOfNewAccountIsZeroByDefaultTest(){
        assertEquals(0, gtBank.checkBalanceFor(1, "1234"));
    }

    @Test
    public void depositCheckBalanceTest(){
        gtBank.deposit(5000, 1);
        assertEquals(5000, gtBank.checkBalanceFor(1, "1234"));
    }

    @Test
    public void cannotDepositAmountZeroAndBelow(){
        int invalidDepositAmountToBank = -200;
        assertThrows(IllegalArgumentException.class,()-> gtBank.deposit(invalidDepositAmountToBank, 1));
    }

    @Test
    public void transferMoneyTest(){
        gtBank.createAccountFor("Legend", "receiverPin");
        gtBank.deposit(4500, 1);
        gtBank.transfer(2000, 1, 2, "1234");
        assertEquals(2500, gtBank.checkBalanceFor(1, "1234"));
        assertEquals(2000, gtBank.checkBalanceFor(2, "receiverPin"));
    }

    @Test
    public void withdrawMoneyTest(){
        gtBank.deposit(5000, 1);
        gtBank.withdraw(2000, 1, "1234");
        assertEquals(3000, gtBank.checkBalanceFor(1, "1234"));
    }

    @Test
    public void cannotWithdrawMoneyBelowBalance(){
        gtBank.deposit(5000, 1);
        int invalidWithdrawalRequestFromBank = -2000;
        assertThrows(IllegalArgumentException.class, ()-> gtBank.withdraw(invalidWithdrawalRequestFromBank, 1, "1234"));
    }

    @Test
    public void cannotWithdrawMoneyAboveBalance(){
        gtBank.deposit(5000, 1);
        int invalidWithdrawalRequestFromBank = 7000;
        assertThrows(IllegalArgumentException.class, ()-> gtBank.withdraw(invalidWithdrawalRequestFromBank, 1, "1234"));
    }

    @Test
    public void findByAccountNumber_throwsException_ifAccountNumberIsWrongTest(){
        assertThrows(IllegalArgumentException.class, ()-> gtBank.findAccountByAccountNumber(2));

    }





}