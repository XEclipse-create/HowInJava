package Random;

import java.util.*;

public class LargestNumDeletingADigit {

    ArrayList<Integer> nList = new ArrayList<>();
    Integer digit;

    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        String num = in.nextLine();
        getArray(num);
        System.out.print("Enter the digit to be removed: ");
        digit = in.nextInt();
    }

    public void getArray(String s){
        for (char c : s.toCharArray())
            nList.add(Character.getNumericValue(c));
    }

    public void getLargestNum(){
        if (!nList.contains(digit))
        {
            System.out.println(digit+" is not present in the entered num.");
            System.exit(0);
        }
        nList.remove(digit);
        nList.sort(Collections.reverseOrder());
    }

    public void display(){
        for (int i : nList)
            System.out.print(i);
    }


    public static void main(String[] args) {
        LargestNumDeletingADigit obj = new LargestNumDeletingADigit();
        obj.getInput();
        obj.getLargestNum();
        obj.display();
    }
}
