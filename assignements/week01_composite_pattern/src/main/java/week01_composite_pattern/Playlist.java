package week01_composite_pattern;

import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }
    
    public void remove(IComponent component) {
        playlist.remove(component);
    }    

    @Override
    public void play() {
        for (IComponent component : this.playlist) {
            component.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent component : this.playlist) {
            component.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }
}
