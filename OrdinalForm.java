/**
 * The method accepts an positive integer array and convert them to ordinal form.
 */

public class OrdinalForm {
    
    public static void main(String[] args){

        int[] arr = {12, 21, 345, 42, 83, 789};

        displayOrdinal(arr);

    }

    public static void displayOrdinal(int[] arr){

        for(int i = 0; i < arr.length; i++){

            int num = arr[i];
            int lastDigit = num % 10;

            
            if(num == 11 || num == 12 || num == 13){
                System.out.print(num + "th" + " ");
            }else{

                switch (lastDigit) {
                    case 1:
                        System.out.print(num + "st" + " ");
                        break;
                    case 2:
                        System.out.print(num + "nd" + " ");
                        break;
                    case 3:
                        System.out.print(num + "rd" + " ");
                        break;
                    default:
                        System.out.print(num + "th" + " ");
                        break;
                }
            }
        }
    }
}
