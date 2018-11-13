package WiringBeans.sharedlibrary;

import WiringBeans.sharedlibrary.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements CompactDisc {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

}
