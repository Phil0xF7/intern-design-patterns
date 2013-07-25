import java.util.ArrayList;

public class Press{
  private ArrayList<Subscriber> subscribers;

  public Press() {
    subscribers = new ArrayList<Subscriber>();
  }

  public void subscribe(Subscriber s) {
    subscribers.add(s);
    System.out.print(s.getName() + " is now subscribed to this paper!\n");
  }

  public void unsubscribe(Subscriber s){
    System.out.print("Bummer! Obviously " + s.getName() + " doesn't like your paper! They've abandoned you.\n");
      subscribers.remove(s);
  }

  public boolean addStory(String story) {
    int f = 1;
    for (int i = 0; i < subscribers.size(); i++) {
      Subscriber subscriber = subscribers.get(i);
      if (!subscriber.update(story)) {
        f = 0;
        unsubscribe(subscriber);
      }
    }
    if (f == 0){
      return false;
    } else {
      return true;
    }
  }

  public int numSubscribers(){
    return subscribers.size();
  }

  public boolean isInBuisness() {
    if(subscribers.size() <= 2){
      System.out.println("Uh oh! We've lost too many subscribers, and can no longer support outselves :( WE'RE DOOMED!\n");
      return false;
    } else {
      return true;
    }
  }
}

