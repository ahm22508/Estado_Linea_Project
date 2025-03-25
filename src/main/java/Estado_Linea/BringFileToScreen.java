package Estado_Linea;

import java.awt.*;
import java.awt.event.KeyEvent;

public class BringFileToScreen {
     static final robot Bot;
    static {
        try {
            Bot = robot.getBotInstance();
        }
        catch (Exception EX){
            throw new RuntimeException(EX);
        }
    }

    public BringFileToScreen(){

    }
    public static void bringResultSheet() throws Exception{
        if (Desktop.isDesktopSupported()) {
            Desktop desk = Desktop.getDesktop();
            if (desk.isSupported(Desktop.Action.OPEN)){
                desk.open(FileAccess.getOperationFile());
            }
        }
    }
    public static void removeCMDFromScreen() throws Exception{
        Bot.getRobot().keyPress(KeyEvent.VK_ALT);
        Bot.getRobot().keyPress(KeyEvent.VK_SPACE);
        Bot.getRobot().keyPress(KeyEvent.VK_N);
        Bot.getRobot().keyRelease(KeyEvent.VK_ALT);
        Bot.getRobot().keyRelease(KeyEvent.VK_SPACE);
        Bot.getRobot().keyRelease(KeyEvent.VK_N);
        Thread.sleep(500);
    }
}
