public class SmartHomeAutomation{
public static void main(String[] args) {
    
SmartHomeHub hub = new SmartHomeHub();

 Light livingRoomLight = new Light("Living Room");
 Thermostat thermostat = new Thermostat();
 MusicPlayer musicPlayer = new MusicPlayer();

 Command turnOnLight = new TurnOnLightCommand(livingRoomLight);
 Command turnOffLight = new TurnOffLightCommand(livingRoomLight);
 Command adjustBrightness = new AdjustBrightnessCommand(livingRoomLight, 75);
 Command setTemp = new SetTemperatureCommand(thermostat, 22);
 Command playMusic = new PlayMusicCommand(musicPlayer, "Chill Vibes");
 Command stopMusic = new StopMusicCommand(musicPlayer);

 System.out.println("--- Testing Light Controls ---");
 hub.sendCommand(turnOnLight);
 hub.sendCommand(adjustBrightness);
 hub.sendCommand(turnOffLight);

 System.out.println("\n--- Testing Thermostat Control ---");
 hub.sendCommand(setTemp);

 System.out.println("\n--- Testing Music Player Controls ---");
 hub.sendCommand(playMusic);
 hub.sendCommand(stopMusic);

    }
}