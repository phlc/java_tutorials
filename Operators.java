public class Operators{
  public static void main(String[] args){
    int i = 0;

    //prefix vs postfix
    System.out.println(i);

    System.out.println(i++);

    System.out.println(i);

    System.out.println(++i);

    System.out.println(i);

    //?: operator
    boolean bool = true;
    i = bool ? 11 : 44;
    System.out.println(i);

    bool = false;
    i = bool ? 11 : 44;
    System.out.println(i);

    //bitwise
    i = 10;
    System.out.println(i);

    i = ~i;
    System.out.println(i);
    System.out.println(++i);
  }
}
