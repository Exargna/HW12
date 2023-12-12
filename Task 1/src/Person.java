public class Person {
    private String name;
    private String post;
    private String affiliation;
    private int age;
    private String paycheck;

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public int getAge() {
        return age;
    }

    public String getPaycheck() {
        return paycheck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPaycheck(String paycheck) {
        this.paycheck = paycheck;
    }

    public Person() {

    }

    public Person(String name, String post, String affiliation, int age, String paycheck) {
        this.name = name;
        this.post = post;
        this.affiliation = affiliation;
        this.age = age;
        this.paycheck = paycheck;
    }
}
