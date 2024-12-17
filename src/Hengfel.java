/*
* File: Hengfel.java
* Author: Bőgér Bence
* Copyright: 2024, Bőgér Bence
* Group: Szoft II-2-N
* Date: 2024-12-17
* Github: https://github.com/BoBenc
* Licenc: MIT
*/

import java.util.Scanner;

public class Hengfel {
    public void startCalc() {
        System.out.println("Feladat 0318");
        System.out.println("Henger felszín számítása");
        System.out.println("Készítette: Bőgér Bence\n");
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Henger sugara: ");
        String radiusStr = sc.nextLine();
        Double radius = Double.parseDouble(radiusStr);

        System.out.print("Henger hossza: ");
        String lengthStr = sc.nextLine();
        Double length = Double.parseDouble(lengthStr);

        Double surface = 2*Math.PI*radius*(radius+length);

        System.out.printf("Henger felszíne: %.2f cm2\n\n", surface);

        sc.close();
    }
}