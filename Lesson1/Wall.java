package Lesson1;

public class Wall implements Overcomeble {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome (Competitable competitable) {
        competitable. jump(height);
    }
}
