package WiringBeans.hidden;

import org.springframework.stereotype.Component;

@Component
public class FromTheInside implements CompactDisc {

    private String title = "From the Inside";
    private String artist = "Linkin Park";

    @Override
    public void play() {
        System.out.println("Play: " + title + "of the artist: " + artist);
    }
}
