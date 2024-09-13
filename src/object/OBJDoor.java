package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJDoor extends SuperObject{

    public OBJDoor(){
        name = "door";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/door.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }

}
