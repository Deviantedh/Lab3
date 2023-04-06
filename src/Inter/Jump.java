package Inter;

import ex.JumpException;

import java.util.Random;

public class Jump {
    public void dojump(String a) throws JumpException {
        Random random = new Random();
        double j = random.nextDouble();
        if (j > 0.5) {
            System.out.println("У " + a + " получилось прыгнуть!");
        } else {
            throw new JumpException(a);
        }
    }
}
