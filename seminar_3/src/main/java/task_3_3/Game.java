package task_3_3;

public interface Game {

    void start(Integer sizeWord, Integer maxTry);
    Answer inputValue(String value);
    GameStatus getGameStatus();
    void restart();

}
