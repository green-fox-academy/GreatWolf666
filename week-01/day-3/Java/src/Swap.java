public class Swap {


        public static int getItself(int itself, int dummy)
        {
            return itself;
        }

        public static void main(String[] args) {
            int a = 123;
            int b = 526;

            a = getItself(b, b = a);


            System.out.println(a);
            System.out.println(b);




        }




}
