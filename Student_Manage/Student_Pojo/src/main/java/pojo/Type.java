package pojo;

public class Type {
    private Integer num;

    private String name;

    private String informationurl;

    private String rulesurl;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getInformationurl() {
        return informationurl;
    }

    public void setInformationurl(String informationurl) {
        this.informationurl = informationurl == null ? null : informationurl.trim();
    }

    public String getRulesurl() {
        return rulesurl;
    }

    public void setRulesurl(String rulesurl) {
        this.rulesurl = rulesurl == null ? null : rulesurl.trim();
    }
}