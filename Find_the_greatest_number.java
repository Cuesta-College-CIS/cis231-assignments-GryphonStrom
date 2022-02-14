public class Find_the_greatest_number {

    public static void main(String[] args) {
        
            int num1 = (int)Math.floor(Math.random()*100);
            int num2 = (int)Math.floor(Math.random()*100);
            int num3 = (int)Math.floor(Math.random()*100);
    
            if (num1 > num2) {
                if (num1 > num3) {
                    System.out.println(num1);
                } else {
                    System.out.println(num3);
                }
            } else {
                if (num2 > num3) {
                    System.out.println(num2);
                } else {
                    System.out.println(num3);
                }
    
    
            }
    
    }
    
    }
    


    

    