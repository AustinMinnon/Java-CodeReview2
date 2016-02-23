import java.time.LocalDateTime;
import java.util.ArrayList;

  public class Definition {
    private static ArrayList<Definition> instances = new ArrayList<Definition>();

    private String mDescription;
    private LocalDateTime mCreatedAt;
    private boolean mCompleted;
    private int mId;

  public Definition(String description) {
    mDescription = description;
    mCreatedAt = LocalDateTime.now();
    mCompleted = false;
    instances.add(this);
    mId = instances.size();
  }

  public String getDescription() {
    return mDescription;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

  public int getId() {
    return mId;
  }

  public void completeDefinition() {
    mCompleted = true;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }

  public static Definition find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
   }
 }

  public static void clear() {
   instances.clear();
  }
}
