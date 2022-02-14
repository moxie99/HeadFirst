package LinkedListTask;

import java.util.LinkedList;

public class StudentScores {

    public static void main(String[] args) {
//    1    Implement a singly Linked List
        LinkedList<Double> studentsScores = new LinkedList<>();


//      2.   adding elements at a given position
        studentsScores.add(1, 45.32);
        studentsScores.add(3, 50.12);
        studentsScores.add(4, 45.7);
        studentsScores.add(5, 85.2);
        studentsScores.add(2, 45.1);
        studentsScores.add(6, 90.67);
        studentsScores.add(9, 95.32);
        studentsScores.add(8, 67.42);
        studentsScores.add(7, 31.67);

//        3. delete an element at a given position
        studentsScores.remove(4 );


//        4. Get the size of the list
        int listSize = studentsScores.size();

//        5. Get an element at a given position
        Double elementAtIndexThree = studentsScores.get(3);

//        6. setting the value of an index to another
//        studentsScores.set(1,34.34);
//        System.out.println(studentsScores);

    }
}
