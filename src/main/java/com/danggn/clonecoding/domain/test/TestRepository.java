package com.danggn.clonecoding.domain.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

/**
 * packageName    : com.danggn.clonecoding.domain.test
 * fileName       : TestRepository
 * author         : peter
 * date           : 2023-02-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-19        peter       최초 생성
 */
@Repository
@EnableJpaRepositories
public interface TestRepository extends JpaRepository<Test, Long> {
}
