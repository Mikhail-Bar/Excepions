import java.util.Scanner;

public class UserExceptions {
    public static void main(String[] args) throws FromOneToNineException, ModulException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 9: ");
        int a  = scanner.nextInt();
        if (a%2!=0) throw new ModulException("Mod");
        try{
            validateNumber(a);
        } catch (FromOneToNineException e) {
            e.printStackTrace();
        }

    }

    static void validateNumber(int a) throws FromOneToNineException {
        if (a<1 || a>9) throw new FromOneToNineException("From 1 to 9");
    }
}
class FromOneToNineException extends Exception{
    public FromOneToNineException(String message) {
        super(message);
    }
}
class ModulException extends Exception {
    public ModulException(String message) {
        super(message);
    }
}