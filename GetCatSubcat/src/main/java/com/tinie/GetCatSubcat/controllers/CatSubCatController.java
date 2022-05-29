package com.tinie.GetCatSubcat.controllers;

import com.tinie.GetCatSubcat.repositories.CategoryRepository;
import com.tinie.GetCatSubcat.responses.CategoryResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CatSubCatController {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ModelMapper mapper;

    /**
     * Get a user's details from the database given their phone number
     * @param httpServletRequest An object of type {@link HttpServletRequest} containing all the information about the request.
     * @return A {@link List} of {@link CategoryResponse}.
     * */
    @GetMapping("list-category-subcategory")
    @ApiOperation(value = "Get list of Categories and associated Subcategories")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "RETRIEVAL SUCCESSFUL"),
            @ApiResponse(code = 500, message = "RETRIEVAL FAILED")
    })
    public ResponseEntity<?> addBankAccount(HttpServletRequest httpServletRequest){

        var categories = categoryRepository.findAll();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        var responseBody = mapper.map(categories, new TypeToken<List<CategoryResponse>>() {}.getType());

        return ResponseEntity.ok(responseBody);
    }
}
