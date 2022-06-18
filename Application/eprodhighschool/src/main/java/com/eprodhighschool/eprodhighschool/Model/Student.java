package com.eprodhighschool.eprodhighschool.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "class_id")
    public Integer classId;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field @Column(name = "name")
     *
     * @return name @Column(name = "name")

     */
    public String getName() {
        return this.name;
    }

    /**
     * set field @Column(name = "name")
     *
     * @param name @Column(name = "name")

     */
    public void setName(String name) {
        this.name = name;
    }
}
