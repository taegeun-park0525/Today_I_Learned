package TIL2022.Oct.Day09;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        Card c1 = new Card();
        Card c2 = new Card();

        c1.kind = "Heart";
        c1.number = 7;
        c2.kind = "Spade";
        c2.number = 4;
        System.out.printf("c1은 %s, %d이며, 크기는 (%d, %d)\n",c1.kind,c1.number,c1.width,c1.height);
        System.out.printf("c2은 %s, %d이며, 크기는 (%d, %d)\n",c2.kind,c2.number,c2.width,c2.height);

        System.out.printf("c1의 width와 height를 각각 50, 80으로 변경합니다. \n");
        c1.width = 50;  //참조변수를 c1이라고 하더라도 static변수(CV)이므로
        c1.height = 80; //같은 클래스를 참조하는 c2객체도 width와 height가 50,80으로 바뀜.

        System.out.printf("c1은 %s, %d이며, 크기는 (%d, %d)\n",c1.kind,c1.number,c1.width,c1.height);
        System.out.printf("c2은 %s, %d이며, 크기는 (%d, %d)\n",c2.kind,c2.number,c2.width,c2.height);

    }
}

class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}