package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by Adetola on 18/06/2019
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}