package ch.so.agi.sqlcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "SQLCUBA_PARENT")
@Entity(name = "sqlcuba_Parent")
@NamePattern("%s|name")
public class Parent extends BaseUuidEntity {
    private static final long serialVersionUID = -4593453529907377345L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "AGE", nullable = false)
    private Integer age;

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

