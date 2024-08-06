package com.RiwiAcademyDB.persistences.crud.Entities;

public class ratingsEntity {

    private int id;
    private int qualification;
    private String id_student;
    private int id_course;

    public ratingsEntity() {
    }

    public ratingsEntity(int id, int qualification, String id_student, int id_course) {
        this.id = id;
        this.qualification = qualification;
        this.id_student = id_student;
        this.id_course = id_course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public String getId_student() {
        return id_student;
    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    @Override
    public String toString() {
        return "id: " + id + ", qualification: " + qualification + ", id_student: " + id_student + ", id_course: " + id_course ;
    }
}
