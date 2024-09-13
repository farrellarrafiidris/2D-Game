package object;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class OBJKey extends SuperObject {
    public OBJKey(){
        name = "key";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/key.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
