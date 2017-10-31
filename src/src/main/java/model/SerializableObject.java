package model;

import java.io.Serializable;


public class SerializableObject implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    public int getId() {
        return id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }

}
