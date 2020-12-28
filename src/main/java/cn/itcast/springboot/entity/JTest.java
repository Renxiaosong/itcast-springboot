package cn.itcast.springboot.entity;


import com.alibaba.fastjson.JSONObject;

public class JTest {
    private Integer id;
    private JSONObject content;
    private String opNotes;
    private Integer isDeleted;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setContent(JSONObject content) {
        this.content = content;
    }

    public JSONObject getContent() {
        return this.content;
    }

    public String getOpNotes() {
        return opNotes;
    }

    public void setOpNotes(String opNotes) {
        this.opNotes = opNotes;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JTest that = (JTest) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "JTest{" +
                "id=" + id +
                ",content='" + content + "'" +
                '}';
    }

}