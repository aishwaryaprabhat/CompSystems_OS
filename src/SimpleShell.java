import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleShell {
    public static void main(String[] args) throws java.io.IOException {
        List<String> commandList = new ArrayList<String>();
        commandList.add("pwd");
        commandList.add("cd");
        ProcessBuilder pb = new ProcessBuilder();
        pb.command(commandList);
        Process p = pb.start();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String commandLine;
        while (true) {
            // read what the user entered
            System.out.print("jsh>");
            commandLine = console.readLine();

            // TODO: adding a history feature

            // if the user entered a return, just loop again
            if (commandLine.equals("")) {
                continue;
            }


            // TODO: creating the external process and executing the command in that process
            // TODO: modifying the shell to allow changing directories
        }
    }
}