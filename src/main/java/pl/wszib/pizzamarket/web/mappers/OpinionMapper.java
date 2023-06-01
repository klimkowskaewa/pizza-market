package pl.wszib.pizzamarket.web.mappers;

import pl.wszib.pizzamarket.data.entities.OpinionEntity;
import pl.wszib.pizzamarket.web.models.OpinionModel;

public class OpinionMapper {

    public static OpinionEntity toEntity(OpinionModel model){
        OpinionEntity entity = new OpinionEntity();
        entity.setOpinionAuthorName(model.getOpinionAuthorName());
        entity.setOpinionContent(model.getOpinionContent());

        return entity;
    }
}