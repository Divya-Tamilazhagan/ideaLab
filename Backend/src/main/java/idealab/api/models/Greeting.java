<<<<<<< HEAD:Backend/src/main/java/idealab/api/models/Greeting.java
package idealab.api.models;
=======
package ideaLab.api.models;
>>>>>>> add hibernate, add all models+enum files:Backend/src/main/java/ideaLab/api/models/Greeting.java

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}