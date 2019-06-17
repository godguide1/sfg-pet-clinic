package guru.springframework.sfgpetclinic.model;

/**
 * Created by Adetola on 17/06/2019
 */
public class petType extends BaseEntity{

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
