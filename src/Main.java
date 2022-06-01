import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println(baiTap.triangleArea(1, 2, 1));
//        baiTap.printCircle(4);
        ArrayList<Character> maxChar = baiTap.getMostFreqChar("Hello Worldo");
        for(Character c : maxChar) {
            System.out.print(c + " ");
        }
    }

}