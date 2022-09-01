//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTestStudent {
    public static void main(String[] args){
        Cell A1 = new Cell("A1", false, 1234);
        Cell B1 = new Cell("B1", true, 1234);
        Cell C1 = new Cell("C1", false, 1234);
        Cell D1 = new Cell("D1", false, 1234);
        PrisonerStudent bubba = new PrisonerStudent("Bubba", 2.08, 4, A1);


        A1.setIsOpen(1233);
        B1.setIsOpen(1234);
        bubba.display();
    }
}