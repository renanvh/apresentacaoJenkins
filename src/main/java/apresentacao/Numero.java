package apresentacao;

public class Numero {
    public static void main(String[] args) {
        System.out.println(checkEven(122));
    }

    public static boolean checkEven(int number){
        return number % 2 == 0;
    }
}
