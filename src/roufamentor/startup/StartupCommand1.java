package roufamentor.startup;

public class StartupCommand1 implements MyStartupCommand {

    @Override
    public void Run() {
        for (int i = 1000; i < 1100; i++) {
            System.out.println("SC1: " + i);
            // Sleep a little to make the parallelism more obvious.
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
