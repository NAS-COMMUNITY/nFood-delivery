package com.example.fooddelivery.dto.mapper;

import com.example.fooddelivery.dto.OrderDto;
import com.example.fooddelivery.model.OrderEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AddressMapper.class, CustomerMapper.class, FoodItemMapper.class})
public interface OrderMapper {
    OrderDto toOrderDto(OrderEntity orderEntity);
}