package reproductor_de_musica;

import java.util.Map;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;

public class Zplayer implements BasicPlayerListener {

    BasicPlayer player = new BasicPlayer();
    BasicController control = (BasicController) player;
    reproductorMain vp;

    public Zplayer(reproductorMain v) {
        player.addBasicPlayerListener(this);
        vp = v;
    }

    @Override
    public void opened(Object o, Map properties) {
    }
    @Override
    public void progress(int i, long l, byte[] bytes, Map properties) {

    }   
    
    @Override
    public void setController(BasicController controller) {
        
    }

    @Override
    public void stateUpdated(BasicPlayerEvent bpe) {
    }
}
