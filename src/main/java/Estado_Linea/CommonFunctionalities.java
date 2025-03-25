package Estado_Linea;


import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class CommonFunctionalities {

private final robot Bot = robot.getBotInstance();


   CommonFunctionalities() throws Exception{

}
    public void generalCheck() throws Exception {

        //Press on Select
        Thread.sleep(500);
        Bot.getRobot().mouseMove(226, 37);
        Bot.getRobot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.getRobot().mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //press on Servicios
        Thread.sleep(500);
        Bot.getRobot().mouseMove(246, 654);
        Bot.getRobot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.getRobot().mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //press on DropMenu
        Bot.getRobot().mouseMove(452, 252);
        Bot.getRobot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.getRobot().mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //press on DropDownMenu
        Bot.getRobot().mouseMove(455, 288);
        Bot.getRobot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.getRobot().mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    protected void PressOnIdentificadorDeServicio() throws Exception {
        //press on Identificador de Servicio
        Bot.getRobot().mouseMove(1183, 254);
        Bot.getRobot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.getRobot().mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(500);
    }

    protected void ExecuteCheck() throws Exception {
        //press on Buscar Button
        Bot.getRobot().mouseMove(1476, 464);
        Bot.getRobot().mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        Bot.getRobot().mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1090);
    }

    protected void CleanCheck() throws Exception {
        //Cleaning Field.
        Bot.getRobot().mouseMove(1050, 254);
        Bot.getRobot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.getRobot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.getRobot().mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Bot.getRobot().keyPress(KeyEvent.VK_DELETE);
        Bot.getRobot().keyRelease(KeyEvent.VK_DELETE);
        Thread.sleep(200);
    }

    protected void EndCheck(){
        //Press on Cerrar Button.
        Bot.getRobot().mouseMove(977, 764);
        Bot.getRobot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.getRobot().mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

}
