import java.util.List;

public class Catalog {
    String catalogName;
    List<Document> documents;
    List<Catalog> catalogs;
    boolean allowedToAll;
    List<User> allowedUsers;
    List<User> blockedUsers;
}
