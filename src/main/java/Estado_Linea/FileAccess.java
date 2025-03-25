package Estado_Linea;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileAccess {
    private final static  File operationFile;
    private final static Workbook openSheet;
    private final static FileInputStream readFile;
    private final static FileOutputStream output;
    private final static Sheet resultSheet;
    static {
        try {
            operationFile = new File("C:\\EstadoLineaApp\\data\\OperationFile.xlsx");
            readFile = new FileInputStream(operationFile);
            openSheet =new XSSFWorkbook(readFile);
            output = new FileOutputStream(operationFile);
            resultSheet = openSheet.getSheet("Result");

        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }


    public FileAccess() {

    }
    public static Sheet getResultSheet() {

        return resultSheet;
    }
    public static File getOperationFile(){
        return operationFile;
    }


    public static void updateFile() throws Exception{
        openSheet.write(output);
    }
    public static void closeAllResources() throws Exception{
        readFile.close();
        output.close();
        openSheet.close();

    }
}
