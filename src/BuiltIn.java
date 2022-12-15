import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BuiltIn {
    public static void main(String[] args) {
        //processArithmeticException();
        //processInputMismatchException();
        //processIOException();
        //processArrayIndexOutOfBoundsException();
        //processClass();
        //processField();
        processNullPointer();
    }

    static void processInputMismatchException(){
        //Обработка исключения ввода
        int a=0;

        while (a == 0){
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter a: ");
            try{
                a=scanner.nextInt();}
            catch (InputMismatchException e) {
                System.err.println("Error, enter an integer number");
            }
        }
    }

    static void processArithmeticException(){
        //Деление на ноль
        int a = 1, b;
        try {
            b = 1 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Деление на ноль");
        }
    }

    static void processIOException(){
        try {
            InputStream input = new FileInputStream("src\\data\\words.txt");
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        System.out.println("File opened...");
    }

    static void processArrayIndexOutOfBoundsException(){
        //Выход за пределы массива
        int a[] = {1,2,3};
        try {
            int b = a[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("OutOfBounds");
        }

    }

    static void processClass(){
        Class<?> clazz = null;
        try {
            clazz = Class.forName("Main");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clazz.getSimpleName());
    }

    static void processField(){
        Person person = new Person();
        Class<?> clazz = person.getClass();
        try {
            Field field = clazz.getDeclaredField("name");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    static void processNullPointer(){
        Person person = null;
        try {
            person.getName();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
