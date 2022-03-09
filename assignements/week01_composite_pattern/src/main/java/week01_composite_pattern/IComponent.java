package week01_composite_pattern;

public interface IComponent {

    public abstract void play();
    public abstract void setPlaybackSpeed(float speed);
    public abstract String getName();
}
