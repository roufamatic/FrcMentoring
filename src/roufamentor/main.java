package roufamentor;

import java.util.ArrayList;

import roufamentor.startup.MyStartupCommand;
import roufamentor.startup.StartupCommand1;
import roufamentor.startup.StartupCommand2;
import roufamentor.startup.StartupCommand3;

class Main {
    public static void main(String[] args) {
        System.out.println("Making commands...");
        ArrayList<MyStartupCommand> cmds = new ArrayList<MyStartupCommand>();
        cmds.add(new StartupCommand1());
        cmds.add(new StartupCommand2());
        cmds.add(new StartupCommand3());
        System.out.println("Calling commands in parallel!");
        cmds.stream().parallel().forEach(cmd -> cmd.Run());
        System.out.println("This line only prints when all commands have finished.");
    }
}