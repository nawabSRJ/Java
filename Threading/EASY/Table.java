
class Two extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 * " + i + " = " + 2 * i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Six extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("6 * " + i + " = " + 6 * i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Table extends Thread {
    public static void main(String[] args) {
        Two obj = new Two();
        Six obj2 = new Six();
        obj.start();
        obj2.start();
    }

}