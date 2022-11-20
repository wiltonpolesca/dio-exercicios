package com.dio;

public class App {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("-- ATM Balance ----------------------------");
        ATM atm = new ATM();
        atm.requestWithdraw(12.0);
        atm.requestWithdraw(26.0);

        System.out.println("");
        System.out.println("-- School Grade -------------------------");
        School school = new School();
        System.out.print("Grade: 6 -> ");
        school.showResult(6);
        System.out.print("Grade: 4 -> ");
        school.showResult(4);
        System.out.print("Grade: 7 -> ");
        school.showResult(7);

        System.out.println("");
        System.out.println("-- School Grade (using ternary operator) --");
        System.out.print("Grade: 6 -> ");
        school.showResult2(6);
        System.out.print("Grade: 4 -> ");
        school.showResult2(4);
        System.out.print("Grade: 7 -> ");
        school.showResult2(7);

        System.out.println("");
        System.out.println("-- Clothes size name --------------------");
        MeasureSystem measure = new MeasureSystem();
        System.out.print("Size: S -> ");
        measure.getSizeName("S");
        System.out.print("Size: M -> ");
        measure.getSizeName("M");
        System.out.print("Size: L -> ");
        measure.getSizeName("L");
        System.out.print("Size: X -> ");
        measure.getSizeName("X");

        System.out.println("");
        System.out.println("-- For: Couting --------------------");
        Loops loops = new Loops();
        loops.testForCount(17);

        System.out.println("-- For: Array --------------------");
        String[] names = { "Wilton", "Lucca", "Pollyanna", "Hugo" };
        loops.testForArray(names);

        System.out.println("-- Foreach  --------------------");
        String[] namesForeach ={"Wilton - Foreach","Lucca - Foreach","Pollyanna - Foreach","Hugo - Foreach"};
        loops.testForeach(namesForeach);

        System.out.println("-- For with Break/Continue  -----");
        loops.testBreakContinue(45);;

        System.out.println("-- While  ------------");
        loops.testWhile(123.0);;

        System.out.println("-- Do while  ------------");
        loops.testDoWhile(123.0);;


    }
}
