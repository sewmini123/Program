public class Program {
    String number;
    Program(String values){
        number=values;
        System.out.println(number);
    }

    public static void main(String[] args) {
        Program num=new Program("Java");
        Program num1=new Program("Python");
        Program num2=new Program("C");
        Program num3=new Program("Kottin");

    }
}
