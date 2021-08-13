package com.sparta.week02.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass // 상속했을 때, 컬럼으로 인식하게 합니다.
@EntityListeners(AuditingEntityListener.class) // 생성/수정 시간을 자동으로 반영하도록 설정, 생성, 수정이 일어날 때 자동으로 반영해줘!
public abstract class Timestamped {
    // abstract: 추상, 직접 구현 안된다. 상속으로만 구현할 수 있다. => new Timestamped 하면 오류남.
    // 무조건 상속으로, extends Timestamped 로 사용해야 한다.


    @CreatedDate // 생성일자임을 나타냅니다.
    private LocalDateTime createdAt;

    @LastModifiedDate // 마지막 수정일자임을 나타냅니다. 수정이 될 때마다 시간이 계속 업데이트 됨.
    private LocalDateTime modifiedAt;
}
