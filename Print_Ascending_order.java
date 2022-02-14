public class Print_Ascending_order {

    public static void main(String[] args) {
        int num1 = (int)(Math.floor(Math.random()*99)+1);
        int num2 = (int)(Math.floor(Math.random()*99)+1);
        int num3 = (int)(Math.floor(Math.random()*99)+1);
        
        System.out.println("Original: " + num1 + ", " + num2 + ", " + num3);

        if (num1 < num2) {
            if (num1 < num3) {
                if (num2 < num3) {
                    System.out.println("Sorted: " + num1 + ", " + num2 + ", " + num3);
                } else {
                    System.out.println("Sorted: " + num1 + ", " + num3 + ", " + num2);
             }
            } else {
                System.out.println("Sorted: " + num3 + ", " + num1 + ", " + num2);
        }

        } else {
            if (num1 < num3) {
                System.out.println("Sorted: " + num2 + ", " + num1 + ", " + num3);
            } else {
                if (num3 < num2) {
                    System.out.println("Sorted: " + num3 + ", " + num2 + ", " + num1);
                } else {
                System.out.println("Sorted: " + num2 + ", " + num3 + ", " + num1);
            }

        }



            }
        }
    }
