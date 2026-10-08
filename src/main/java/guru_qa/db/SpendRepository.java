package guru_qa.db;

import guru_qa.entity.SpendEntity;

import java.util.List;

public interface SpendRepository {
    List<SpendEntity> getAll();
}
