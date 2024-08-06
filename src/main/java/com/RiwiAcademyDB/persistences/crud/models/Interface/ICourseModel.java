package com.RiwiAcademyDB.persistences.crud.models.Interface;

import com.RiwiAcademyDB.persistences.crud.Entities.coursesEntity;
import com.RiwiAcademyDB.persistences.crud.models.Interface.CreateModel;
import com.RiwiAcademyDB.persistences.crud.models.Interface.DeleteModel;
import com.RiwiAcademyDB.persistences.crud.models.Interface.EditModel;
import com.RiwiAcademyDB.persistences.crud.models.Interface.SearchModel;

import javax.swing.text.html.parser.Entity;

public interface ICourseModel extends CreateModel<Entity>, DeleteModel<String>, EditModel<Entity>, SearchModel<Entity> {
    coursesEntity edit(coursesEntity request);

    coursesEntity create(coursesEntity request);
}