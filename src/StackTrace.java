public class StackTrace {
    public static void main(String[] args) {
        call();
    }

    static void call(){
        Exception e = new Exception();
        e.printStackTrace();
        String msg = e.getStackTrace()[0].getClassName();
        System.err.println(msg);
        String msg1 = e.getStackTrace()[0].getMethodName();
        System.err.println(msg1);
        int msg2 = e.getStackTrace()[0].getLineNumber();
        System.err.println(msg2);


    }
}
