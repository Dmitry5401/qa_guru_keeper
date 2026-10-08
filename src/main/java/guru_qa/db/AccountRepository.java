package guru_qa.db;

import guru_qa.entity.AccountEntity;

import java.util.List;

public interface AccountRepository {
    List<AccountEntity> getAll();
    AccountEntity getByName(String name);
}
