package com.codegnan.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codegnan.dto.FavouriteRequestDTO;
import com.codegnan.dto.FavouriteResponseDTO;
import com.codegnan.service.FavouriteService;

@RestController
@RequestMapping("/favourites")
public class FavouriteController {

    private static final Logger log =
            LoggerFactory.getLogger(FavouriteController.class);

    @Autowired
    private FavouriteService favouriteService;
    

    public FavouriteController(FavouriteService favouriteService) {
		super();
		this.favouriteService = favouriteService;
	}

	@PostMapping
    public FavouriteResponseDTO addFavourite(
            @RequestBody FavouriteRequestDTO request) {

        log.info("FavouriteController :: addFavourite() started");
        log.debug("Request details - userId: {}, productId: {}",
                request.getUserId(), request.getProductId());

        FavouriteResponseDTO response =
                favouriteService.addFavourite(request);

        log.info("FavouriteController :: addFavourite() completed successfully with id: {}",
                response.getId());

        return response;
    }

    @DeleteMapping
    public String removeFavourite(
            @RequestParam Integer userId,
            @RequestParam Long productId) {

        log.info("FavouriteController :: removeFavourite() started");
        log.debug("Request details - userId: {}, productId: {}",
                userId, productId);

        favouriteService.removeFavourite(userId, productId);

        log.info("FavouriteController :: removeFavourite() completed successfully");

        return "Removed Successfully";
    }

    @GetMapping("/{userId}")
    public List<FavouriteResponseDTO> getUserFavourites(
            @PathVariable Integer userId) {

        log.info("FavouriteController :: getUserFavourites() started for userId: {}",
                userId);

        List<FavouriteResponseDTO> favourites =
                favouriteService.getUserFavourites(userId);

        log.info("FavouriteController :: getUserFavourites() completed. Total records: {}",
                favourites.size());

        return favourites;
    }
}