package com.camoutech.airbnbclone.listing.application.dto;

import com.camoutech.airbnbclone.listing.application.dto.sub.PictureDTO;
import com.camoutech.airbnbclone.listing.application.dto.vo.PriceVO;
import com.camoutech.airbnbclone.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
