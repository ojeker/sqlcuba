package ch.so.agi.sqlcuba.entity;

import com.haulmont.cuba.core.global.DbView;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@DbView
@Table(name = "SQLCUBA_PARENT_V")
@Entity(name = "sqlcuba_ParentV")
public class ParentV extends ParentB {
    private static final long serialVersionUID = 4581563332573713050L;

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

}