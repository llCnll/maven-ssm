package pojo;

public class Contesttype {
    private Integer id;

    private String tiime;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTiime() {
        return tiime;
    }

    public void setTiime(String tiime) {
        this.tiime = tiime == null ? null : tiime.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}