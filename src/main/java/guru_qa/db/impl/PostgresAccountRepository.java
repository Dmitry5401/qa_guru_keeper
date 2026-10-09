package guru_qa.db.impl;

import guru_qa.db.AccountEntityRowMapper;
import guru_qa.db.AccountRepository;
import guru_qa.db.DataSourceProvider;
import guru_qa.entity.AccountEntity;
import org.jspecify.annotations.Nullable;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PostgresAccountRepository implements AccountRepository {

    private static final JdbcTemplate template = new JdbcTemplate(
        DataSourceProvider.INSTANCE.getDataSource()
    );


    @Override
    public List<AccountEntity> getAll() {
        return template
            .query("SELECT * FROM account", new AccountEntityRowMapper());
    }

    @Override
    @Nullable
    public AccountEntity getByName(String accountName) {
        try {
            return template
                .queryForObject("SELECT * FROM account WHERE name = ?",
                    new AccountEntityRowMapper(), accountName);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public void addAccount(AccountEntity account) {
        template.update("INSERT INTO account (name, value) VALUES (?, ?)",
            account.getName(), account.getValue());
    }
}
