import java.util.concurrent.TimeUnit;

public class delay {
    public static void delayl(){
        try {
            TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.println(".");
    }
    public static void delay2(){
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
        }
    public static void delay3(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
    public static void delay4(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
    public static void delay5(){
        for(int i = 0; i < 5; ++i) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.println(".");
        }
    }
}

