import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

//        Declarative Programming
        for (int i = 1; i <= 5; i++) {
            if(i==3) break;
            System.out.println("i = " + i);
        }
//
//        String[] friends = {"Monica", "Rachel", "Ross"};
//        Enhanced For Loop
//        Imperative Programming
//        for(String friend : friends){
//            friend = "Chandler";
//            System.out.println(friend);
//            System.out.println(Arrays.toString(friends));
//        }
    }
}