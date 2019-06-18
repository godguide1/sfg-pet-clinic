package guru.springframework.sfgpetclinic.model;

/**
 * Created by Adetola on 19/06/2019
 */
public class PetType extends BaseEntity {

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
