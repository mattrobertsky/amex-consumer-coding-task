package consumer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "events")
public class Events {
  @Id
  private String id;
  private Attributes attributes;

  public Attributes getAttributes() {
    return attributes;
  }

  public void setAttributes(Attributes attributes) {
    this.attributes = attributes;
  }

  @Override
  public String toString() {
    return "ClassPojo [attributes = " + attributes + "]";
  }
}
