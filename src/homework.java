public class homework {
    public static void main(String[] args) {
//        задача 1

        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String result = hi.trim() + world.toLowerCase() + newLine;
        String newresult = result.repeat(3);
        System.out.println(newresult);

//        задача 2

    double lenth = 1.82;
    int weight = 90;
    double bodyIndex = weight / (lenth * lenth);
        System.out.println(bodyIndex + " kg/m2");

    }
}
