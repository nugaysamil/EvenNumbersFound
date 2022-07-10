public class DoWhileüStatament {

    public static void main(String[] args) {


        int count = 0;
       while(count != 5){
           System.out.println("Count value is " + count);
            count++;
       }

        while(true) {
            if(count==5) {

            break; }

            System.out.println("Count Value is " + count);
            count++;
        }

        int number = 2;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;

            }
            evenNumbersFound++;
            if(evenNumbersFound >=5){
                break;
            }

            System.out.println("Total even numbers found = " + evenNumbersFound);

        }
        System.out.println("Total even numbers found = " + evenNumbersFound);

        }

        public static boolean isEvenNumber(int number) {
         if ((number % 2) == 0){
         return true;

        }else {
             return false;


         }

}
}

