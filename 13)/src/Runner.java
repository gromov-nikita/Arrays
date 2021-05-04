import countingGenerator.CountingGenerator;

/*
Exercise 13: (2) Fill a String using CountingGenerator.Character.
 */
public class Runner {
    public static void main(String[] args) {
        CountingGenerator.Character obj = new CountingGenerator.Character();
        int size = 10;
        String str = "";
        for(int i = 0; i < size; i++) {
            str += obj.next();
        }
        System.out.println(str);
    }
}
