package guru.springframework.sfgpetclinic.model;

/**
 * Created by Adetola on 22/06/2019
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
