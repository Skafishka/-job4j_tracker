package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public void printOut() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error1 = new Error(true, 02, "Error message");
        Error error2 = new Error();
        error1.printOut();
        error2.printOut();
    }
}
