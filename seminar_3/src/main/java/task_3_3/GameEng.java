package task_3_3;

import java.util.ArrayList;
import java.util.List;

public class GameEng extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> list = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            list.add(String.valueOf((char)i));
        }
        return list;
    }
}
