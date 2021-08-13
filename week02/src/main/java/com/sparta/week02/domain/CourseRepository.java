package com.sparta.week02.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}

// CourseRepository: SQL 역할을 대신해주는 것, Course 에 관한 Repository.
// extends: 다른 기능을 내가 가져와서 이용한다. JpaRepository 에 있는 기능을 Course Repository 에 내가 가져와서 쓸꺼야. 라는 뜻
// JPA 는 SQL 쿼리 날리는 것, 그러면 어떤 걸 대상으로 어떤 것을 식별할 수 있는지 써줘야 함.
// <Course, Long> : Course 라는 것을 사용하고 id의 형태가 Long 이다.

// JPA 는 인터페이스를 통해서만 사용할 수 있다.
// 인터페이스란? 클래스에서 멤버가 빠진 메소드 모음집.

// JpaRepository 는 인터페이스라는 뜻, 멤버 변수 이런 건 없고 메소드가 많은 녀석
// CourseRepository 또한 메소드만 잔쯕 모여있는 것. 그 메소드는 내가 작성하는 것이 아니고 JPA 에서 미리 작성된 것을 가져다 쓰는 것




