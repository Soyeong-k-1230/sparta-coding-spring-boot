package com.sparta.week03.service;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor // final 로 선언된 변수가 있으면, 그 변수를 생성할 때 반드시 넣어 주겠다는 뜻!
@Service
public class MemoService {

    private final MemoRepository memoRepository; // final 꼭 필요하다고 말해줘야함

    @Transactional // update 할 때 이게 DB에 직접 반영 되야한다는 것을 알려줌.
    public Long update(Long id, MemoRequestDto requestDto) { // id와 변경시킬 때 필요한 정보
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        memo.update(requestDto);
        return memo.getId();
    }
}