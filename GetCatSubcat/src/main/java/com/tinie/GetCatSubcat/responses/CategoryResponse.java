package com.tinie.GetCatSubcat.responses;

import com.tinie.GetCatSubcat.models.Category;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;

import java.util.Set;

@Data
public class CategoryResponse {

    private int id;
    private String name;
    private Set<SubCategoryResponse> subCategories;

    private static CategoryResponse fromEntity(Category category, ModelMapper mapper) {
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        return mapper.map(category, CategoryResponse.class);
//        var categoryResponse = mapper.map(category, CategoryResponse.class);
//        categoryResponse.setSubCategories(
//                mapper.map(categoryResponse.subCategories, new TypeToken<Set<SubCategoryResponse>>() {}.getType())
//        );
//        return categoryResponse;
    }
}
