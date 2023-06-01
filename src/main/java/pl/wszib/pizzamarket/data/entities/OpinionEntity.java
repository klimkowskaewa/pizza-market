package pl.wszib.pizzamarket.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "opinions")
public class OpinionEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String opinionAuthorName;

    private String opinionContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpinionAuthorName() {
        return opinionAuthorName;
    }

    public void setOpinionAuthorName(String opinionAuthorName) {
        this.opinionAuthorName = opinionAuthorName;
    }

    public String getOpinionContent() {
        return opinionContent;
    }

    public void setOpinionContent(String opinionContent) {
        this.opinionContent = opinionContent;
    }
}