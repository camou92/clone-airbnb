package com.camoutech.airbnbclone.listing.application.dto;

import com.camoutech.airbnbclone.listing.application.dto.vo.PriceVO;

import java.util.UUID;

public record ListingCreateBookingDTO(
        UUID listingPublicId, PriceVO price) {
}