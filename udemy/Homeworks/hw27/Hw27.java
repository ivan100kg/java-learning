package Homeworks.hw27;

public class Hw27 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("meat");
        try {
            t.drink("water");
            try {
                t.drink("beer");
            } catch (NoWaterException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage() + "");
            } finally {
                System.out.println("Inner finally");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage() + "");
        }
    }
}

class NoMeatException extends RuntimeException {
    NoMeatException(String s) {
        super(s);
    }
}

class NoWaterException extends Exception {
    NoWaterException(String s) {
        super(s);
    }
}

class Tiger {
    void eat(String s) {
        if (!s.equals("meat")) {
            throw new NoMeatException("Tiger doesn't eat " + s);
        } else {
            System.out.println("Tiger eats a meat");
        }
    }

    void drink(String s) throws NoWaterException {
        if (!s.equals("water")) {
            throw new NoWaterException("Tiger doesn't drink " + s);
        } else {
            System.out.println("Tiger drinks a water");
        }
    }
}
