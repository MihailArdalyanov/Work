package Lesson1;

public class Human implements Competitable {
    public int heightJump;
    private int runLength;

    public Human(int heightJump, int runLength) {
        this.heightJump = heightJump;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if(height > heightJump ) {
            System.out.println("Я человек, а не птица!");
        } else {
            System.out.println("Изи-изи!");
        }

    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Человек столько не бегает");
        } else {
            System.out.println("Даже не устал!");
        }

    }
}

