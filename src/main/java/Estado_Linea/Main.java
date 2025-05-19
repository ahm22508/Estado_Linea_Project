package Estado_Linea;

import java.util.Scanner;

public class Main {

    public static void main(String[]args) throws Exception{
        System.out.println("Before Running, Make sure that your screen is 125% and the left side draft of Clarify is CLOSED!");
        System.out.println("press 1 for AC and 2 for PA");
        Scanner scan = new Scanner(System.in);
        int selector = scan.nextInt();

        BringFileToScreen.removeCMDFromScreen();
        Clarify.ShowWindow();
        Preparation.prepareSystem();

        if(selector == 1){
            CommonFunctionalities common =  new CommonFunctionalities();
            CheckingAC check = new CheckingAC();

            common.generalCheck();
            check.PressOnAC();
            check.PressOnIdentificadorDeServicio();
            check.CheckAc();
            check.CleanCheck();
            check.EndCheck();

            FileAccess.updateFile();
            FileAccess.closeAllResources();
            BringFileToScreen.bringResultSheet();
        }
        if(selector == 2){
            Clarify.ShowWindow();
            CommonFunctionalities common =  new CommonFunctionalities();
            CheckingPA check = new CheckingPA();

            common.generalCheck();
            check.PressOnPA();
            check.PressOnIdentificadorDeServicio();
            check.CheckPA();
            check.CleanCheck();
            check.EndCheck();

            FileAccess.updateFile();
            FileAccess.closeAllResources();
            BringFileToScreen.bringResultSheet();
        }
    }
}
