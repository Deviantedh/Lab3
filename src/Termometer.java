import ex.TermometerException;

import java.util.Random;
public class Termometer extends Thing{
    private float temperature = -7;
    public Termometer(String b) {
        super(b);
    }
    public void changetemp() throws TermometerException {
        Random random = new Random();
        int randomNumber = random.nextInt(8) + 8; // генерируем случайное число от 0 до 7 и добавляем 8 для получения чисел в диапазоне от 8 до 15
        int temperature = -randomNumber;
        ///temperature = (int)(Math.random() * -8) + (-15);
        if (temperature <= -10) {
            System.out.println("На внутреннем термометре Дэнни: " + temperature + " градусов");
        }
        else {
            throw new TermometerException("");
        }
    }


}
