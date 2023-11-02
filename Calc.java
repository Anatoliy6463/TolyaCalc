/* My simple calculator */
import java.util.Scanner; 
 
class Calc {
    public static void main(String args[]) {
        System.out.println ("Введите два целых числа");
		Scanner k = new Scanner(System.in);
        int n1 = k.nextInt();
        int n2 = k.nextInt();
        System.out.println ("Что вы хотите сделать с этими числами? + = 1, - = 2, x = 3, / = 4");
        Scanner l = new Scanner(System.in);
        int  deistviye = l.nextInt();
        int otvet = 0;
        if (deistviye == 1){
            otvet = n1 + n2;
            System.out.println("Ответ: " + otvet);
        } 
        else if (deistviye == 2){
            otvet = n1 - n2;
            System.out.println("Ответ: " + otvet);
        } 
        else if (deistviye == 3){
            otvet = n1 * n2;
            System.out.println("Ответ: " + otvet);
        } 
        else if (deistviye == 4 && n2 != 0){
            otvet = n1 / n2;
            System.out.println("Ответ: " + otvet);
        }
        else if (deistviye == 4 && n2 == 0){
            System.out.println("НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ");
        }
	}
}
