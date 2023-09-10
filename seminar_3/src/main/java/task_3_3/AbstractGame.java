package task_3_3;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game{
    // предзаполняет слово компьютера - generateWord(),
    // на основе generateCharList() - который является абстрактным методом
    Integer sizeWord;
    Integer maxTry;
    String word;
    GameStatus gameStatus = GameStatus.INIT;

    /**
     * @apiNote метод предзаполняет слово компьютера
     * @return слово для угадывания
     */
    public String generateWord(){
        List<String> abc = generateCharList();
        Random r = new Random();
        String result = "";
        for (int i = 0; i < sizeWord; i++) {
            int index = r.nextInt(abc.size());
            result = result.concat(abc.get(index));
            abc.remove(index);
        }
        return result;
    }

    abstract List<String> generateCharList();

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.word = generateWord();
        gameStatus = GameStatus.START;
        System.out.println("подсказка: " + word);
    }

    @Override
    public Answer inputValue(String value) {
        maxTry--;
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (value.charAt(i) == word.charAt(j) && i == j){
                    bulls++;
                    cows++;
                } else if (value.charAt(i) == word.charAt(j) && i != j){
                    cows++;
                }
            }
        }
        if(word.length() == bulls){
            gameStatus = GameStatus.WIN;
        }
        if(maxTry == 0 && !gameStatus.equals(GameStatus.WIN)){
            gameStatus = GameStatus.GAMEOVER;
        }

        return new Answer(value, bulls, cows);
    }

    @Override
    public GameStatus getGameStatus() {

        return gameStatus;
    }

    @Override
    public void restart() {

    }



}
