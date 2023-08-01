/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author irsya
 */

import model.AgeCategory;
import java.util.List;


public interface CategoryDAO {
    
    public boolean insert(AgeCategory c);
    
    public boolean update(AgeCategory c);
    
    public boolean delete(AgeCategory c);
    
    public List<AgeCategory> getAllCategory();
    
    public AgeCategory getByID(String id);
    
    public List<AgeCategory> getByName(String name);
}
