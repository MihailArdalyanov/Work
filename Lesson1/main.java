package Lesson1;

public class main {
    public static void main(String[] args) {
        Competitable[] competitors = {new Cat(4, 30), new Human(2, 15),
                new Robot(5, 40)};

        Overcomeble[] overcomebles = {new Wall(3), new Treadmill(60)};

        for (Competitable competitable : competitors) {
            for (Overcomeble overcomeble : overcomebles) {
                overcomeble.overcome(competitable);
            }
        }
    }

    }

