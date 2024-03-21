package java_avc;

public class Controles {
    public static void main(String[] args) {
        int grade = 92;
        if (grade >= 90) {
            System.out.println("NENGUE");
        } else if ((grade < 90) && (grade >= 70)) {
            System.out.println("Fala mais baixo, nengue!");
        } else if ((grade < 70) && (grade >= 50)) {
            System.out.println("tas maluco, nengue?!");
        } else {
            System.out.println("Muito alto!");
        }
    }
}
