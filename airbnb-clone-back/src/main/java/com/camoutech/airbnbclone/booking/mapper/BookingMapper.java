package com.camoutech.airbnbclone.booking.mapper;

import com.camoutech.airbnbclone.booking.application.dto.BookedDateDTO;
import com.camoutech.airbnbclone.booking.application.dto.NewBookingDTO;
import com.camoutech.airbnbclone.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}