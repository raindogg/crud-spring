@Entity
@Indexed
public class Person {
  @Id
  @GenereatedValue
  private Long id;

  @Field(termVector = TermVector.YES)
  private String name;

  @Field
  private int age;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return String.formate("Person{id=%d, name=%s, age=%d", id, name, age);
  }
}