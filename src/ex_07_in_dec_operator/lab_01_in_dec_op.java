package ex_07_in_dec_operator;

public class lab_01_in_dec_op {
   public static void main(String[] args) {
        String age_string= args[0];
        int age=Integer.parseInt(age_string);
       System.out.println("age");
       System.out.println(args[1]);
       String canIGoGoa =  age >= 18 ? "Yes" : "No";
       System.out.println(canIGoGoa);





    }
}
