package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJBoots extends SuperObject{
    public OBJBoots(){
        name = "boots";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/boots.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
