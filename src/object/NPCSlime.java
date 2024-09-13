package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class NPCSlime extends SuperObject{
    public NPCSlime(){
        name = "Slime";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/slime.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
