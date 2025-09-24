public class Light implements Device {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    @Override
    public void turnOn() {
        System.out.println(location + " light has been turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(location + " light has been turned OFF.");
    }

    public void adjustBrightness(int level) {
        System.out.println(location + " light brightness has been set to " + level + "%.");
    }
}