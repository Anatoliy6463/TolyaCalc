import java.util.Scanner; 
class Calc {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите два числа");
        double n1 = k.nextInt();
        double n2 = k.nextInt();
        System.out.println ("Что вы хотите сделать с этими числами? ");
        char deistviye = k.next().charAt(0);
        double otvet = 0;
        if (deistviye == '+'){
            otvet = n1 + n2;
            System.out.println(n1 + " + " + n2 + "=" + otvet);
        } 
        else if (deistviye == '-'){
            otvet = n1 - n2;
            System.out.println(n1 + " - " + n2 + "=" + otvet);
        } 
        else if (deistviye == '*'){
            otvet = n1 * n2;
            System.out.println(n1 + " x " + n2 + "=" + otvet);
        } 
        else if (deistviye == '/' && n2 != 0){
            otvet = n1 / n2;
            System.out.println(n1 + " / " + n2 + "=" + otvet);
        }
        else if (deistviye == '/' && n2 == 0){
            System.out.println("НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ");
        }
        else if (deistviye == '^' && n2 != 0){
            double a = n1;
            double n = n2;
            for (int o = 1; o < n; o++) {
                a *= n2;
            }
            System.out.println (n1 + " ^ " + n2 + " = " + a);
        }
         else if (deistviye == '^' && n2 == 0){
            System.out.println (n1 + " ^ 0  = 1");
        }
	}
}
