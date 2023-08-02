/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author irsya
 */
public class Film{
    
//    bikin variable pake private
        private int id;
        private String film_title;
        private String age_category;
        
    
    // bikin constructor pake variable diatas
        public Film(int id, String film_title, String age_category){
            this.id = id;
            this.film_title = film_title;
            this.age_category = age_category;
        }
//    bikin getter setter 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilm_title() {
        return film_title;
    }

    public void setFilm_title(String film_title) {
        this.film_title = film_title;
    }

    public String getAge_category() {
        return age_category;
    }

    public void setAge_category(String age_category) {
        this.age_category = age_category;
    }
        
        
}

    
    
