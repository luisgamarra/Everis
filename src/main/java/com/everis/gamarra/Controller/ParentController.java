package com.everis.gamarra.Controller;

import com.everis.gamarra.Entity.Parent;
import com.everis.gamarra.Service.ParentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0")
public class ParentController {

   @Autowired
   private ParentDAO parentDAO;

   @GetMapping("/parents")
    public List<Parent> findAllParents(){
       return parentDAO.getAllParents();
   }

   @PostMapping("/parents")
    public void addParent(@RequestBody Parent obj){
       parentDAO.addParent(obj);
   }

   @PutMapping("/parents")
    public void updateParent(@RequestBody Parent obj){
       parentDAO.updateParent(obj);
   }

   @DeleteMapping("/parents/{id}")
    public void deleteParent(@PathVariable("id") Integer id){
       parentDAO.deleteParent(id);
   }
}
