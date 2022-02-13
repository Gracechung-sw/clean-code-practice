package com.practice.houseutils.service;

import com.practice.houseutils.repository.ApartmentRepository;
import org.springframework.stereotype.Service;

public class ApartmetnService {

    @Service
    private final ApartmentRepository apartmentRepository;// 생성자 주입
}
