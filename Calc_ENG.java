import java.util.Scanner; 

class Calc {
    public static void main(String args[]) {
        System.out.println ("Enter two numbers");
                Scanner k = new Scanner(System.in);
        double n1 = k.nextInt();
        double n2 = k.nextInt();
        System.out.println ("What do you want to do with these numbers? + = 1, - = 2, x = 3, / = 4, ^ = 5");
        int  deistviye = i.nextInt();
        double otvet = 0;
        if (deistviye == 1){
            otvet = n1 + n2;
            System.out.println(n1 + " + " + n2 + "=" + otvet);
        } 
        else if (deistviye == 2){
            otvet = n1 - n2;
            System.out.println(n1 + " - " + n2 + "=" + otvet);
        } 
        else if (deistviye == 3){
            otvet = n1 * n2;
            System.out.println(n1 + " x " + n2 + "=" + otvet);
        } 
        else if (deistviye == 4 && n2 != 0){
            otvet = n1 / n2;
            System.out.println(n1 + " / " + n2 + "=" + otvet);
        }
        else if (deistviye == 4 && n2 == 0){
            System.out.println("YOU CAN'T DIVIDE ON ZERO");
        }
        else if (deistviye == 5 && n2 != 0){
            double a = n1;
            long int n = n2;
            for (int o = 1; o < n; o++) {
                a *= n2;
            }
            System.out.println (n1 + " ^ " + n2 + " = " + a);
        }
         else if (deistviye == 5 && n2 == 0){
            System.out.println (n1 + " ^ 0  = 0");
        }
        }
}