import com.fasterxml.jackson.annotation.JsonProperty;

public class Information {

    public final String id;
    public final String text;
    public final String type;
    public final String user;
    public final Integer upvotes;

    public Information(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\t id = " + id +
                "\n\t text = " + text.substring(0, 20) +
                "\n\t type = " + type +
                "\n\t user = " + user +
                "\n\t upvotes = " + upvotes +
                "\n}";
    }
}
