package roufamentor.startup;

public class StartupCommand2 implements MyStartupCommand {

    @Override
    public void Run() {
        for (int i = 2000; i < 2100; i++) {
            System.out.println("SC2: " + i);
            // Sleep a little to make the parallelism more obvious.
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
