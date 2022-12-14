public class Course extends Teacher{
    // id, nazwa, opis.
    private  String name;
    private  String description;

    public Course(int id,String name,String description) {
        super(id);
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return"id:"+ getId()+" Nazwa kierunku:"+name+"    Opis kierunku:"+description;
    }
}

