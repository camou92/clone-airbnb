package com.camoutech.airbnbclone.listing.application.dto.sub;

import com.camoutech.airbnbclone.listing.application.dto.vo.DescriptionVO;
import com.camoutech.airbnbclone.listing.application.dto.vo.TitleVO;
import jakarta.validation.constraints.NotNull;

public record DescriptionDTO(
        @NotNull TitleVO title,
        @NotNull DescriptionVO description
) {
}