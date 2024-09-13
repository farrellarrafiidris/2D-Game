package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJChest extends SuperObject{

    public OBJChest(){
        name = "chest";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
