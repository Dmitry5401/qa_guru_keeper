package guru_qa.entity;

import guru_qa.data.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Генерирует геттеры, сеттеры, equals, hashCode и toString
@NoArgsConstructor // Генерирует пустой конструктор (нужен для многих фреймворков, например, Spring)
@AllArgsConstructor
@Builder

public class SpendEntity {
    private int id;
    private int account_id;
    private Category spendCategory;
    private int spend;
}