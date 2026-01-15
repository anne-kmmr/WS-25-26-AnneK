    class Quotient {
    public static void main(String args[]) {
        float a, b, quotient;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter a: ");
        a = scan.nextFloat();
        System.out.println("Enter b: ");
        b = scan.nextFloat();
        if (b != 0) {
            quotient = a / b;
            System.out.println("Quotient: " + quotient);
        }
        else {
            System.out.println(b + " for b is invalid.");
        }
        //muss geschlossen werden?!
        //scan.close();
    }
}