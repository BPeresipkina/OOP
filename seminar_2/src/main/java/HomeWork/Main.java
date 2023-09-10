package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Creatures> participants = new ArrayList<>(Arrays.asList(new Robot("Робот"), new Human("Человек"), new Cat("Кот")));
        ArrayList<Creatures> winners = new ArrayList<>(participants);

        Random randTrack = new Random();
        Random randWall = new Random();

        ArrayList<Obstacl> obstacles = new ArrayList<>();
        obstacles.add(new Track(randTrack.nextInt(100, 300)));
        obstacles.add(new Wall(randWall.nextInt(1, 3)));
        obstacles.add(new Track(randTrack.nextInt(100, 300)));
        obstacles.add(new Wall(randWall.nextInt(1, 3)));
        obstacles.add(new Track(randTrack.nextInt(100, 300)));
        obstacles.add(new Wall(randWall.nextInt(1, 3)));
        obstacles.add(new Track(randTrack.nextInt(100, 300)));

        for (int i = 0; i < winners.size(); i++) {
            System.out.println(winners.get(i));
            for (int j = 0; j < obstacles.size(); j++) {
                var h = obstacles.get(j);
                if (h instanceof Wall){
                    System.out.println("Стена: " + ((Wall) h).getHeight() + " м!");
                    if (winners.get(i).Jump(((Wall) h).getHeight()) == 0) {
                        System.out.println(winners.get(i) + " не смог пробежать!");
                        winners.remove(i);
                        i--;
                        break;
                    } else {
                        System.out.println(winners.get(i) + " преодалел " + (j+1) + " препятствие!");
                    }
                } else if (h instanceof Track){
                    System.out.println("Трасса: " + ((Track) h).getDistance() + " м!");
                    if (winners.get(i).Run(((Track) h).getDistance()) == 0) {
                        System.out.println(winners.get(i) + " не смог пробежать!");
                        winners.remove(i);
                        i--;
                        break;
                    } else {
                        System.out.println(winners.get(i) + " преодалел " + (j+1) + " препятствие!");
                    }
                }
                if (j == obstacles.size()-1) {
                    System.out.println(winners.get(i) + " успешно пробежал!");
                }
            }
        }
    }
}
