package com.bootcamp.project.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.bootcamp.project.Model.Stock;
import com.bootcamp.project.Model.dto.StockDTO;

import org.springframework.stereotype.Component;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());
        return stock;
    }

    public StockDTO toDTO(Stock stock) {
        StockDTO dto = new StockDTO();
        dto.setId(stock.getId());
        dto.setName(stock.getName());
        dto.setPrice(stock.getPrice());
        dto.setVariation(stock.getVariation());
        dto.setDate(stock.getDate());
        return dto;
    }

    public List<StockDTO> toDTO(List<Stock> list) {
        return list.stream().map(this::toDTO).collect(Collectors.toList());
    }

}
