package com.RiwiAcademyDB.persistences.crud.Entities;

public class coursesEntity {

    private int id;

    private String title;

    public coursesEntity() {
    }

    public coursesEntity(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return

                "id: " + id +
                ", title: " + title ;
    }
}
