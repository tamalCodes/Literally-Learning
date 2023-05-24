
public class HelloTamal extends Thread {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                if (i == 5) {
                    try {
                        Thread.sleep(5000);
                        System.out.println(Thread.currentThread().getName() + " is sleeping ");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
