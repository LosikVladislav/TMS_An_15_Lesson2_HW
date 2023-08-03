public class FibNum {
    public static void main(String[] args) {
    int numFirst = 1;
    int numSecond = 1;
    int numNext;
    System.out.print(numFirst + " " + numSecond + " ");
    for (int i = 3; i <= 10; i++){
        numNext=numFirst+numSecond;
        System.out.print(numNext + " ");
        numFirst = numSecond;
        numSecond = numNext;
    }
   System.out.println();
    }
}
