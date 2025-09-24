public class PlayMusicCommand implements Command {
    private MusicPlayer musicPlayer;
    private String playlistName;

    public PlayMusicCommand(MusicPlayer musicPlayer, String playlistName) {
        this.musicPlayer = musicPlayer;
        this.playlistName = playlistName;
    }

    @Override
    public void execute() {
        musicPlayer.playPlaylist(playlistName);
    }
}