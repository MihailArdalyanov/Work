package Lesson1;

public class Cat implements Competitable {
    public int heightJump;
    private int runLength;

    public Cat(int heightJump, int runLength) {
        this.heightJump = heightJump;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if(height > heightJump ) {
            System.out.println("Кот-несправился!");
        } else {
            System.out.println("Изи-изи!");
        }

    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Кот столько не бегает");
            } else {
            System.out.println("Даже не устал!");
        }

    }
}
