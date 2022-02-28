package Lessons.Lesson27;

public class Test15 {
    void marathon(int airTemp, int runSpeed) throws BreakLegException {
        if (runSpeed > 12) {
            throw new BreakLegException("too fast: " + runSpeed);
        }
        if (airTemp > 32) {
            throw new PainInMuscleException();
        }
        System.out.println("You win!");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
            t.marathon(20, 14);
        } catch (BreakLegException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In any case you'll get a reward");
        }
    }
}

class BreakLegException extends Exception {
    BreakLegException(String msg) {
        super(msg);
    }

    BreakLegException() {
    }
}

class PainInMuscleException extends RuntimeException {
    PainInMuscleException(String msg) {
        super(msg);
    }

    PainInMuscleException() {
    }
}
