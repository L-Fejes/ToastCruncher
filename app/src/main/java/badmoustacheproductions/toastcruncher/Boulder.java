package badmoustacheproductions.toastcruncher;

import java.util.Random;

/**
 * Created by LJBFe on 2017-05-07.
 */

public class Boulder extends GameObject {

    Boulder(float worldStartX, float worldStartY, char type) {
        final float HEIGHT = 1;
        final float WIDTH = 3;

        setHeight(HEIGHT);
        setWidth(WIDTH);

        setType(type);

        setBitmapName("boulder");
        setActive(false);

        // Randomly set the boulder either infront or behind the player
        Random rand = new Random();
        if(rand.nextInt(2) == 0) {
            setWorldLocation(worldStartX, worldStartY, -1);
        } else {
            setWorldLocation(worldStartX, worldStartY, 1);
        }
    }
    

    public void update(long fps, float gravity) {}
}
