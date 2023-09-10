package task_3_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    private String userInput;
    private Integer bull;
    private Integer cow;

    @Override
    public String toString() {
        return "Результат: " +
                "ваш вариант - " + userInput +
                ", быков - " + bull +
                ", коров - " + cow;
    }
}
