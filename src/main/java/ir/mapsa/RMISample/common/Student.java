package ir.mapsa.RMISample.common;

import java.io.Serializable;

public class Student implements Serializable {
    private long id;
    private String fullname;
    private String nationalCode;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                "}\n";
    }

    public Student(long id, String fullname, String nationalCode) {
        this.id = id;
        this.fullname = fullname;
        this.nationalCode = nationalCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getnationalCode() {
        return nationalCode;
    }

    public void setnationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
