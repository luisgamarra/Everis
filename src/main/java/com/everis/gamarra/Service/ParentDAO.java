package com.everis.gamarra.Service;

import com.everis.gamarra.Entity.Parent;

import java.util.List;

public interface ParentDAO {

    public List<Parent> getAllParents();
    public void addParent(Parent obj);
    public void updateParent(Parent obj);
    public void deleteParent(Integer id);

}
