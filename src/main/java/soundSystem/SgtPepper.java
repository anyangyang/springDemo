package soundSystem;

import org.springframework.stereotype.Component;

@Component("lonelyHeartClub")
public class SgtPepper implements CompactDisc {

    private String title = "sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "the Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
