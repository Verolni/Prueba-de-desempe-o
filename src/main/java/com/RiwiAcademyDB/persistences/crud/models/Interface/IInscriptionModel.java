package com.RiwiAcademyDB.persistences.crud.models.Interface;

import com.RiwiAcademyDB.persistences.crud.Entities.inscriptionsEntity;

import javax.swing.text.html.parser.Entity;

public interface IInscriptionModel extends
        CreateModel<inscriptionsEntity>,
        DeleteModel<String>,
        EditModel<inscriptionsEntity>,
        SearchModel<inscriptionsEntity>  {

}
