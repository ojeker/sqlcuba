package ch.so.agi.sqlcuba.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.global.DbView;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@DbView
@Table(name = "SQLCUBA_PARENT_V")
@Entity(name = "sqlcuba_ParentV")
public class ParentV extends BaseUuidEntity {
    private static final long serialVersionUID = 4581563332573713050L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "AGE", nullable = false)
    private Integer age;

    @NotNull
    @Column(name = "NUM_CHILDREN")
    private Integer numChildren;

    @NotNull
    @Column(name = "SUM_AGE")
    private Integer sumAge;


    public Integer getSumAge() {
        return sumAge;
    }

    public void setSumAge(Integer sumAge) {
        this.sumAge = sumAge;
    }

    public Integer getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(Integer numChildren) {
        this.numChildren = numChildren;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}