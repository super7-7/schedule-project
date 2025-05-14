package com.example.scheduleapp.service;

import com.example.scheduleapp.dto.ScheduleResponseDto;
import com.example.scheduleapp.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    //속성
    private final ScheduleRepository scheduleRepository;
    //생성자
    publc ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }
    //기능
    //일정 생성
    public void createSchedule(scheduleRequestDto requestDto) {
        scheduleRepository.save(requestDto);
    }
    //전체 일정 조회
    public List<ScheduleResponseDto> getSchedules() {
        return scheduleRepository.findAll();
    }
    //득정 Id 일정 조회
    public ScheduleResponseDto getScheduleById(long id) {
        return scheduleRepository.findById(id);
    }
}
