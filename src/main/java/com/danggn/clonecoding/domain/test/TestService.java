package com.danggn.clonecoding.domain.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class TestService {
    private final TestRepository testRepository;
    public String getName(Long id) {
        Test test = testRepository.findById(id).orElseThrow();
        return test.getName();
    }
}
