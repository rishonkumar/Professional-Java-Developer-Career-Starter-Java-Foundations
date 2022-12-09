public class Main {
    static int distinctRemainders(int n)
    {

        // If n is even
        if (n % 2 == 0)
            return (n / 2);

        // If n is odd
        return (1 + (n / 2));
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 3;
        System.out.println(distinctRemainders(n));
    }

}