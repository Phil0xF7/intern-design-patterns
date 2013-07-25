public class Subscriber {
  private String name;
  private int strikes;

  public Subscriber(String name) {
    this.name = name;
    strikes = 0;
  }

  public String getName(){
    return name;
  }

  public boolean update(String story) {
    if (story.length() <= 10) {
      System.out
          .print(name
              + " is not a happy subscriber because there is no story here! You have "
              + (3 - strikes) + " strikes left\n");
      strikes++;
      if (strikes == 3) {
        return false;
      }
    } else {
      System.out.print(name + " is happy with the story, thanks!\n");
    }
    return true;
  }
}
