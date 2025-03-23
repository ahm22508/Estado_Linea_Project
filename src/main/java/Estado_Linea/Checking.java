package Estado_Linea;

import java.awt.*;
import java.awt.event.InputEvent;

public class Checking {
    private static final Robot Bot;
    static {
        try {
            Bot = new Robot();
        }
        catch (Exception EX){
            throw new RuntimeException(EX);
        }
    }

    
    public Checking(){
        
    }
    public static void generalCheck() throws Exception {

        //Press on Select
        Thread.sleep(500);
        Bot.mouseMove(226, 37);
        Bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //press on Servicios
        Thread.sleep(500);
        Bot.mouseMove(246, 654);
        Bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //press on DropMenu
        Bot.mouseMove(452, 252);
        Bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //press on DropDownMenu
        Bot.mouseMove(455, 288);
        Bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
