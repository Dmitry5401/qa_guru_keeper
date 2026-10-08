package guru_qa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Генерирует геттеры, сеттеры, equals, hashCode и toString
@NoArgsConstructor // Генерирует пустой конструктор (нужен для многих фреймворков, например, Spring)
@AllArgsConstructor
@Builder

public class AccountEntity {
    private int id;
    private String name;
    private double value;

}