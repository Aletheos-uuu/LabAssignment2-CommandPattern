public class MusicPlayer implements Device {
    private String currentPlaylist = "";

    public void playPlaylist(String playlistName) {
        this.currentPlaylist = playlistName;
        System.out.println("Music player is now playing playlist: " + playlistName);
    }

    public void stop() {
        if (!currentPlaylist.isEmpty()) {
            System.out.println("Music player has stopped playing '" + currentPlaylist + "'.");
            currentPlaylist = "";
        } else {
            System.out.println("Music player is already stopped.");
        }
    }

    @Override
    public void turnOn() {
        // Default behavior for turning on the music player
        playPlaylist("Default Mix");
    }

    @Override
    public void turnOff() {
        stop();
    }
}