public class SmartHomeHub {
    public void sendCommand(Command command) {
        System.out.println("Hub: Sending a command...");
        command.execute();
    }
}