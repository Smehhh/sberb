package sberbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Package {
    private Integer id;
    private String lesson;


    public Package(int id, String lesson) {
        this.id = id;
        this.lesson = lesson;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
