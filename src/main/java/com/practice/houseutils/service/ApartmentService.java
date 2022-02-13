package com.practice.houseutils.service;

import com.practice.houseutils.HouseutilsApplication;
import com.practice.houseutils.repository.ApartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor // 생성자 주입
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    @Transactional
    public Long getPriceOrThrow(Long apartmentId) {
        return apartmentRepository.findById(apartmentId)
                .orElseThrow(() -> new HouseutilsApplication(ErrorCode.ENTITY_NOT_FOUND))
                .getPrice();
    }
}
