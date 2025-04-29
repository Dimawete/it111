public class LitersToGallonsConverter {

    public static void main(String[] args) {

        double liter, gallon;

        int counter = 0;

        for (gallon = 1; gallon <= 100; gallon = gallon + 4) {

            liter = gallon * 3.79;
            counter +=1;
            //  System.out.println(liter+" liters = " +gallon+ " gallons");

            System.out.printf("%.2f", liter);

            if (gallon == 1) {
                System.out.println(" liters = " + gallon + " gallon");
            } else {
                System.out.println(" liters = " + gallon + " gallons");
            }


            if(counter ==5) {
                System.out.println();
                counter = 0;

            }

        } // end of loop

        System.out.println("We are done!!!");
    }
}


