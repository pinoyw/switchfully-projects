
public class ProgramArguments {
    public static void main(String[] args) {

//        String[] array = {"first", "second", "third"};

        printArray(args);

    }

    public static void printArray(String[] array) {
        System.out.println("Program arguments:");
        if( array.length==0) System.out.println("None");
        for (int i = 0; i < array.length; i++) System.out.println(i + ": " + array[i]);
    }


}