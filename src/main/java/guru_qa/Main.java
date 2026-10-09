package guru_qa;

import guru_qa.db.AccountRepository;
import guru_qa.db.impl.PostgresAccountRepository;
import guru_qa.entity.AccountEntity;

import javax.swing.*;

public class Main {

    static AccountRepository accountRepository = new PostgresAccountRepository();

    public static void main(String[] args) {

        String accountName = JOptionPane.showInputDialog("Представьтесь, пожалуйста");
        AccountEntity workAccount = accountRepository.getByName(accountName);
        if (workAccount == null) {
            int balance = Integer.parseInt(JOptionPane.showInputDialog("Введите баланс:"));

            AccountEntity account = AccountEntity.builder()
                .name(accountName)
                .value(balance)
                .build();

            accountRepository.addAccount(account);
        }
    }

}
