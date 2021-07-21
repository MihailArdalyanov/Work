package Lesson1;

public class Treadmill implements Overcomeble {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void overcome(Competitable competitable) {
        competitable.run(length);
    }
}
