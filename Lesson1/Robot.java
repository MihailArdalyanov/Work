package Lesson1;

public class Robot implements Competitable {
    public int heightJump;
    private int runLength;

    public Robot(int heightJump, int runLength) {
        this.heightJump = heightJump;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if(height > heightJump ) {
            System.out.println("Робот-несправился!");
        } else {
            System.out.println("Изи-изи!");
        }

    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Робот не Усейн Болт");
        } else {
            System.out.println("Выполнено!");
        }

    }
}
