package guru_qa;

import guru_qa.db.DataSourceProvider;
import guru_qa.entity.AccountEntity;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JdbcTemplate template = new JdbcTemplate(
            DataSourceProvider.INSTANCE.getDataSource()
        );

        String accountName = JOptionPane.showInputDialog("Введите ваше имя:");
        int balance = Integer.parseInt(JOptionPane.showInputDialog("Введите баланс:"));

        AccountEntity account = AccountEntity.builder()
            .name(accountName)
            .value(balance)
            .build();


        template.update("INSERT INTO account (name, value) VALUES (?, ?)",
            account.getName(), account.getValue());
    }

}
