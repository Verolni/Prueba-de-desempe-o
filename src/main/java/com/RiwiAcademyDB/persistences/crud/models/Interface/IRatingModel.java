package com.RiwiAcademyDB.persistences.crud.models.Interface;

import com.RiwiAcademyDB.persistences.crud.Entities.inscriptionsEntity;
import com.RiwiAcademyDB.persistences.crud.Entities.ratingsEntity;

import javax.swing.text.html.parser.Entity;

public interface IRatingModel extends CreateModel<Entity>, DeleteModel<String>, EditModel<Entity>, SearchModel<Entity> {
    ratingsEntity edit(ratingsEntity request);

    ratingsEntity create(ratingsEntity request);

    inscriptionsEntity create(inscriptionsEntity request);
}
