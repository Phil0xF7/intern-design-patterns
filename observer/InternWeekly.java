import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InternWeekly {
  public static Press printingPress;
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    printingPress = new Press();

    subscribePerson("Justin");
    subscribePerson("Brian");
    subscribePerson("Marni");

    Queue<String> names = new LinkedList<String>();
    names.add("Jeff");
    names.add("Andrew");
    names.add("Emma");
    names.add("Hailee");
    names.add("Melissa");

    while(printingPress.isInBuisness()){
      System.out.println("You need to give us a story to print!\n");
      String story = scanner.nextLine();
      System.out.println("Sending out the following story: \n\n" + story);
      if(printingPress.addStory(story)){
        subscribePerson(names.remove());
      }
    }
  }

  public static void subscribePerson(String name){
    Subscriber newPerson = new Subscriber(name);
    printingPress.subscribe(newPerson);
  }
}

