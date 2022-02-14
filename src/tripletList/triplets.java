package tripletList;

import com.sun.jdi.CharType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class triplets {

    public static void main(String[] args) {

       float myNum = 0.12344f;

       long myFigure = 7654435678976546345L;

       String myName = "Oluwasegun";

       System.out.println(myName.split(""));

        System.out.println(myName);

        LinkedList<Double> al=new LinkedList<Double>();



        al.add(12.1);
        al.add(23.6);
        al.add(55.3);

        al.remove(12.1);


        System.out.println(al.size());
        System.out.println(al.getFirst());
        System.out.println(al.get(1));

        System.out.println(al);

    }
}
