public class ObjectPractice03 {

    public static void main(String[] args) {
        Circle op03 = new Circle();


        op03.radius = 20;

        System.out.println("半径20の円の面積:" + op03.getArea() );
        System.out.println("半径20の円の円周:" + op03.getCircumference());
    }

}

