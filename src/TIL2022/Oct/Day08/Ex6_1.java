package TIL2022.Oct.Day08;

public class Ex6_1 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 현재체널은" + t1.channel + "입니다.");
        System.out.println("t2의 현재체널은" + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t21 현재체널은" + t1.channel + "입니다.");

        t2.channel= t1.channel;
        System.out.println("t21 현재체널은" + t1.channel + "입니다.");
        System.out.println("t21 현재체널은" + t2.channel + "입니다.");
    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power() { power = !power;}
    void channelUp() { channel++;}
    void channelDown() { channel--;}
}
