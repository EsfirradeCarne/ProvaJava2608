
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ProvaQuestao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int tpT, tpH, tpM, tpS;
        float msi = 0, msF;
        
        System.out.println("Massa Inicial (em Gramas):\n");
        msI = sc.nextFloat("%f" + msi);
        
        msF = msi;
        tpT = 0;
        while (msF >= 0.5) {
        msF = msF / 2;
        tpT = tpT + 50;
    }
        System.out.println("\n");
        System.out.println("Massa Inicial.: %7.0f gramas.\n" + msi);
        System.out.println("Massa Final...: %9.2f gramas.\n" + msF);

        System.out.println("\n");
        System.out.println("Tempo Total...: %d segundos.\n" + tpT);
        
        tpH = (tpT / 3600);
        tpM = (tpT / 3600) / 60;
        tpS = (tpT / 3600) / 60;
        
        System.out.println("Tempo dividido foi: %d horas:%d minutos:%d segundos." + tpH + tpM + tpS);
        
}
}