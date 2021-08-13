package com.sparta.week02.service;

import com.sparta.week02.domain.Course;
import com.sparta.week02.domain.CourseRepository;
import com.sparta.week02.domain.CourseRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor // Lombok, 아무 매서드에서나 변수룰 사용할 수 있게 된다.
@Service // 스프링에게 이 클래스는 서비스임을 명시, update 하는 작업이 있을 수 있으니깐 알아두라는 뜻.
public class CourseService {

    // final: 서비스에게 꼭 필요한 녀석임을 명시, 꼭 필요한 변수는 final 로 선언을 해주고
    private final CourseRepository courseRepository;

    // Update => 어떤 데이터가 업데이트 되었는지 id를 알려주는 것, 전달 받는 것은 2개의 재료가 필요함
    // 1. 어떤 데이터를 업데이트 할 것인지? id 2. 업데이트할 정보를 가져오는 값
    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌, 자동으로 Database 에 적용됨.
    public Long update(Long id, CourseRequestDto requestDto) {
        // 1. id를 우선 찾고
        Course course1 = courseRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        course1.update(requestDto); // course 데이터의 update 매서드 활용, 내 정보를 바꿔줌.
        return course1.getId();
    }
}