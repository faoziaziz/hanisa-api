package tech.faozi.hanisa.models;

import javax.persistence.*;

public class Hanisa {


    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(columnDefinition = "serial")
    private int id;
    private String short_desc;
    @Lob
    private String long_desc;
    private String link_ref;
    private String link_pic;

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

    /* link refferece */
    public String getLinkRef(){
	return link_ref;
    }
    
    public void setLinkRef(String link_ref){
	this.link_ref = link_ref;

    }


    /* link picture */
    public String getLinkPic(){

	return link_pic;

    }

    public void setLinkPic(String link_pic){
	this.link_pic=link_pic;

    }

    
}
