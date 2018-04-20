import java.util.concurrent.ThreadLocalRandom;

public class RandomNum

/*
*Пример создания случайных чисел в заданном диапазоне.
* Заданные значения генерируются включительно.
*/

 {

    static int i;
    public static void main(String[] args) {
        int max = 90;
        int min = 10;
        int randomNum;

        while (i != min) {
            randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            i = randomNum;
            System.out.println(randomNum);
        }


    }
}


