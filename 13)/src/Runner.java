import countingGenerator.CountingGenerator;

/*
Exercise 13: (2) Fill a String using CountingGenerator.Character.
 */
public class Runner {
    public static void main(String[] args) {
        CountingGenerator.Character obj = new CountingGenerator.Character();
        StringBuilder stringBuilder = new StringBuilder();
        int size = 10;
        for(int i = 0; i < size; i++) {
            stringBuilder.append(obj.next());
        }
        System.out.println(stringBuilder);
    }
}
