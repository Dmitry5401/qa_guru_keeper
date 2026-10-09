package guru_qa.db;

import guru_qa.entity.AccountEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountEntityRowMapper implements RowMapper<AccountEntity> {

    @Override
    public AccountEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return AccountEntity.builder()
            .id(rs.getInt("id"))
            .name(rs.getString("name"))
            .value(rs.getInt("value"))
            .build();
    }
}
