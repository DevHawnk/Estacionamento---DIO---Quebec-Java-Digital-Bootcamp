package br.com.dio.parking.controller.dto;

import lombok.Data;


   //modelo para gera o banco e controle dos veiculos e usuarioa
@Data
public class ParkingCreateDTO {
    private String id;
    private String license;
    private String state;
    private String model;
    private String color;
}
