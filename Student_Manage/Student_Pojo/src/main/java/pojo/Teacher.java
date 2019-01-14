package pojo;

public class Teacher {
    private String teacherum;

    private String teachername;

    public String getTeacherum() {
        return teacherum;
    }

    public void setTeacherum(String teacherum) {
        this.teacherum = teacherum == null ? null : teacherum.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }
}