package entities;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}