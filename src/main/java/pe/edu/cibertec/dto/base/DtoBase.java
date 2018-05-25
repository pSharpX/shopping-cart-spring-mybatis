package pe.edu.cibertec.dto.base;

import java.io.Serializable;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
public abstract class DtoBase implements Serializable{

    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
