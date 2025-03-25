package Estado_Linea;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.sikuli.script.Screen;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class CheckingPA extends CommonFunctionalities {
    private final robot Bot = robot.getBotInstance();
    private final Screen pcScreen = new Screen();

    public CheckingPA() throws Exception {

    }

    public void PressOnPA() throws Exception {
        // press on PA
        Thread.sleep(300);
        Bot.getRobot().mouseMove(346, 280);
        Bot.getRobot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Bot.getRobot().mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void CheckPA() throws Exception {
        Cell LineaCell;
        String Linea;
        Sheet resultSheet = FileAccess.getResultSheet();
        for (Row Lineas : resultSheet) {
            LineaCell = Lineas.getCell(0);
            if (LineaCell != null) {
                Linea = LineaCell.getStringCellValue();
                for (char digit : Linea.toCharArray()) {
                    Bot.getRobot().keyPress(KeyEvent.getExtendedKeyCodeForChar(digit));
                }
            }
            ExecuteCheck();
            if (pcScreen.has("C:\\EstadoLineaApp\\img\\PopUp.png")) {
                Lineas.createCell(1).setCellValue("No Preactivada");
                //Clean Error.
                Bot.getRobot().mouseMove(764, 475);
                Bot.getRobot().mousePress(KeyEvent.BUTTON1_DOWN_MASK);
                Bot.getRobot().mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            }
            if (!pcScreen.has("C:\\EstadoLineaApp\\img\\PopUp.png")) {
                Lineas.createCell(1).setCellValue("Preactivada");
            }
            CleanCheck();
        }
    }
}
