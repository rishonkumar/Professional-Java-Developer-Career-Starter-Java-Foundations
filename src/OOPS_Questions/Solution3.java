package OOPS_Questions;
//https://tcsxplorejavacodingquestions.blogspot.com/2022/01/tcs-ira-13-december-java-coding.html
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Newspaper[] newspapers = new Newspaper[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            newspapers[i] = new Newspaper(a, b, c, d);
        }

        int input1 = sc.nextInt();
        sc.nextLine();
        String input2 = sc.nextLine();
        int ans2 = findTotalPriceByPublicationYear(newspapers, input1);
        if (ans2 > 0) {
            System.out.println(ans2);
        } else {
            System.out.println("No Newspaper found with the mentioned attribute");
        }
        Newspaper z = searchNewspaperByName(newspapers, input2);
        if (z == null) {
            System.out.println("No Newspaper found with the given name.");
        } else {
            System.out.println("regNo-" + z.regNo);
            System.out.println("name-" + z.name);
            System.out.println("publicationYear-" + z.publicationYear);
            System.out.println("price-" + z.price);

        }
    }

    public static int findTotalPriceByPublicationYear(Newspaper[] newspapers, int input1) {

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (newspapers[i].publicationYear == input1) {
                sum += newspapers[i].price;
            }
        }
        if (sum > 0) {
            return sum;
        }
        return 0;
    }


    public static Newspaper searchNewspaperByName(Newspaper[] newspapers, String input2) {
        for (int i = 0; i < 4; i++) {
            if (newspapers[i].name.equalsIgnoreCase(input2)) {
                return newspapers[i];
            }
        }
        return null;
    }
}

class Newspaper {

    int regNo;

    String name;

    int publicationYear;

    int price;


    //parametrized constructor


    public Newspaper(int regNo, String name, int publicationYear, int price) {

        this.regNo = regNo;

        this.name = name;

        this.publicationYear = publicationYear;

        this.price = price;

    }

}
