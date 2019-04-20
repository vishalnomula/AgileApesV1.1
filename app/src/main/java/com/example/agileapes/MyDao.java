package com.example.agileapes;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void addQanda(Qanda qanda);

    @Query("select * from qanda")
    public List<Qanda> getQandas();

    @Query("select id, question from qanda where id = :id")
    public Qanda getQuestionById(int id);

}
