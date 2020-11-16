package tech.faozi.hanisa.models;

import javax.persistence.*;

public class Hanisa {
    private int id;
    private String short_desc;
    @Lob
    private String long_desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

  
    public String getShortDesc() {
        return short_desc;
    }

    public void setShortDesc(String short_desc) {
        this.short_desc = short_desc;
    }

    /* for long description */
    public String  getLongDesc(){
	return long_desc;

    }

    public void setLongDesc(String long_desc){
	this.long_desc=long_desc;
    }

    
}
