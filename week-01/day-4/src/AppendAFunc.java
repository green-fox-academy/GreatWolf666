public class AppendAFunc {

    public static void main(String[] args) {

        String typo = "Chinchill";
        String append = "a";

        System.out.println(AppendAFunc(typo, append));



    }


    public static String AppendAFunc(String typo, String append) {

        final String s = typo + append;
        return s;

    }

}
