public class Main {

    public static void main(String[] args) {

        /* 1. Start with calculating the volume for each tower. 2. Add all volumes together. 3. Calculate water usage per day.
         * 4.  Calculate water difference. 5. Find Water saved per person per day. 5. Output all values in  a clear way, use formatting */
        //Constant values
        double pi = 3.14;
        // Tower Heights
        float tH1 = 72, tH2 = 19, tH3 = 50, tH4 = 67, tH5 = 16, tH6 = 53;
        float tH7 = 69, tH8 = 30, tH9 = 52, tH10 = 40, tH11 = 31, tH12 = 75;
        // Tower Diameters
        double tD1 = 22, tD2 = 18, tD3 = 13, tD4 = 16, tD5 = 14, tD6 = 23;
        double tD7 = 22, tD8 = 22, tD9 = 23, tD10 = 16, tD11 = 18, tD12 = 23;
        //Volumes for Towers
        double volT1 = pi*(tD1/2)*(tD1/2)*tH1;
        double volT2 = pi*(tD2/2)*(tD2/2)*tH2;
        double volT3 = pi*(tD3/2)*(tD3/2)*tH3;
        double volT4 = pi*(tD4/2)*(tD4/2)*tH4;
        double volT5 = pi*(tD5/2)*(tD5/2)*tH5;
        double volT6 = pi*(tD6/2)*(tD6/2)*tH6;
        double volT7 = pi*(tD7/2)*(tD7/2)*tH7;
        double volT8 = pi*(tD8/2)*(tD8/2)*tH8;
        double volT9 = pi*(tD9/2)*(tD9/2)*tH9;
        double volT10 = pi*(tD10/2)*(tD10/2)*tH10;
        double volT11 = pi*(tD11/2)*(tD11/2)*tH11;
        double volT12 = pi*(tD12/2)*(tD12/2)*tH12;
        //Total Volume (Meters^3)
        double totVol = volT1+volT2+volT3+volT4+volT5+volT6+volT7+volT8+volT9+volT10+volT11+volT12;
        //Total Gallons In Supply
        double totGallons = (totVol*1000)/3.78541;
        //Normal Water Usage For 28 Days (Whole Town) - Cubic and Gallons
        double cubic28 = 37640*(.246)*28;
        double gal28 = 37640*65*28;
        //Water Saved Per Person Whole 28 Days
        double saved28C = (cubic28%totVol)/37640;
        double saved28G = (gal28%totGallons)/37640;
        //Water Saved Per Person Per Day
        double savedPerDayC = (saved28C/28);
        double savedPerDayG = (saved28G/28);

        System.out.printf("%-1s %.2f", "The total volume of the towers is",totVol);System.out.print(" cubic meters.");
        System.out.println();
        System.out.printf("%-1s %.2f","The total amount of gallons in the towers is",totGallons);System.out.print(" gallons.");
        System.out.println("\n");
        System.out.print("In the whole 28 days each person would have to save ");System.out.printf("%.2f\n", saved28C);
        System.out.print("cubic meters of water. Daily they would have to save ");
        System.out.printf("%.2f\n",savedPerDayC);System.out.print("cubic meters of water.");
        System.out.println("\n");
        System.out.print("The amount of gallons saved per person for the 28 days is "); System.out.printf("%.2f\n",saved28G);
        System.out.print("total gallons. And daily they would need to save is ");System.out.printf("%.2f\n",savedPerDayG);
        System.out.print("total gallons of water.");

    }
}
