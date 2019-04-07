package com.everis.gamarra.Service;

import com.everis.gamarra.Entity.Parent;
import com.everis.gamarra.Repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService implements ParentDAO {

    @Autowired
    private ParentRepository parentRepository;

    @Override
    public List<Parent> getAllParents(){
        return parentRepository.findAll();
    }

    @Override
    public void addParent(Parent obj){
        parentRepository.save(obj);
    }

    @Override
    public void updateParent(Parent obj){
        parentRepository.save(obj);
    }

    @Override
    public void deleteParent(Integer id){
        parentRepository.deleteById(id);
    }
}
