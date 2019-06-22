package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by Adetola on 19/06/2019
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
