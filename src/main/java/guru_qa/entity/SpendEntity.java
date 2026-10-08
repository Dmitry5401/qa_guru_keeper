package guru_qa.entity;

import guru_qa.data.Category;

public record SpendEntity(int id,
                          int account_id,
                          Category spendCategory,
                          int spend) {
}