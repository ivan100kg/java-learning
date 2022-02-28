package Lessons.Lesson27;

public class Test16 {
    public static void main(String[] args) {
//        if (args.length < 1) {
//            throw new IllegalArgumentException("Wrong count of parameters");
//        }
        Plane p = new Plane();
        p.toFly();
        p.toWait();
        p.toCancel();
    }
}

class Plane {
    String status = "waiting"; // flying, cancelled

    public void toFly() {
        status = "flying";
        System.out.println("Plane flies");
    }

    public void toWait() {
        if (status.equals("flying")) {
            throw new IllegalStateException("Plane has flown already");
        }
        status = "waiting";
        System.out.println("Plane waits");
    }

    public void toCancel() {
        if (status.equals("flying")) {
            throw new IllegalStateException("Plane has flown already");
        }
        status = "cancelled";
        System.out.println("Flight is cancelled");
    }

}
