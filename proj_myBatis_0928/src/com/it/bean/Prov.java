package com.it.bean;

public class Prov {
    private String prov_id;
    private String prov_name;
    public Prov() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Prov(String provId, String provName) {
        super();
        prov_id = provId;
        prov_name = provName;
    }
    public String getProv_id() {
        return prov_id;
    }
    public void setProv_id(String provId) {
        prov_id = provId;
    }
    public String getProv_name() {
        return prov_name;
    }
    public void setProv_name(String provName) {
        prov_name = provName;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.prov_id+"\t"+this.prov_name;
    }
}
