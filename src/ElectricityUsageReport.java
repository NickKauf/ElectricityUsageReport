import java.util.Scanner;

public class ElectricityUsageReport {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name;
        int number, usage, cost;

        System.out.println("customer name?");
        name = kb.nextLine();
        System.out.println("customer number?");
        number = kb.nextInt();
        System.out.println("how many kilowatt hours did you use this month?");
        usage = kb.nextInt();

        System.out.printf("monthly usage report for %s (customer# %d)\n", name, number);
        if (usage > 200){
            cost = (((usage - 200)*8+2200)/100);
        }
        else {
            cost = ((usage*11)/100);
        }
        System.out.printf("you used %d kw/h and your cost is %d dollars", usage, cost);

    }
}
