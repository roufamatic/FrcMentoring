package roufamentor.startup;

public class StartupCommand3 implements MyStartupCommand {

    @Override
    public void Run() {
        for (int i = 3000; i < 3100; i++) {
            System.out.println("SC3: " + i);
            // Sleep a little to make the parallelism more obvious.
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
