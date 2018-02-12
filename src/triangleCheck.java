import java.util.Scanner;


class triangleCheck {

    private static float aSide = 0, bSide = 0, cSide = 0;
    public static void main(String[] args) {
        getInput();
        checkTriangle();
    }

    private static void checkTriangle(){
        if (aSide <= 0 || bSide <= 0 || cSide <= 0) {
            System.out.println("Not a valid triangle!");
        } else if (aSide + bSide <= cSide || aSide + cSide <= bSide || bSide + cSide <= aSide) {
            System.out.println("Not a valid triangle!");
        } else if(aSide==bSide && aSide == cSide){
            System.out.println("Equilateral triangle.");
        } else if((aSide==bSide && aSide!=cSide )||(bSide==cSide && bSide!=aSide)||(aSide==cSide && aSide!=bSide) ){
            System.out.println("Isosceles triangle.");
        }else{
            System.out.println("Scalene triangle.");
        }

    }

    private static void getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("a number:");
        String input1 = scanner.next();
        System.out.println("b number:");
        String input2 = scanner.next();
        System.out.println("c number:");
        String input3 = scanner.next();

        checkIfNumbersAreValid(input1,input2,input3);
    }

    private static void checkIfNumbersAreValid(String input1, String input2, String input3){
        try {
            aSide = Integer.parseInt(input1);
            bSide = Integer.parseInt(input2);
            cSide = Integer.parseInt(input3);
        } catch (NumberFormatException ignored) {

        }
    }
}