import java.util.Scanner; 
 
class Calc {
    public static void main(String args[]) {
        System.out.println ("Введите два целых числа");
		Scanner k = new Scanner(System.in);
        int n1 = k.nextInt();
        int n2 = k.nextInt();
        System.out.println ("Что вы хотите сделать с этими числами? + = 1, - = 2, x = 3, / = 4, ^ = 5");
        int  deistviye = i.nextInt();
        int otvet = 0;
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
            System.out.println("НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ");
        }
        else if (deistviye == 5 && n2 != 0){
            int a = n1;
            int n = n2;
            int m = 0;
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
