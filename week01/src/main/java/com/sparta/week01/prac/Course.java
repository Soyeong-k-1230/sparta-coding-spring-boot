package com.sparta.week01.prac;

public class Course {
    // title, tutor, days 가 Course 라는 맥락 아래에서 의도가 분명히 드러나죠!
    private String title;
    private String tutor;
    private int days;
    
    // 기본생성자 - Java에서 기본적으로 생성해줌. (생성자를 선언 안한 경우)
    public Course() {
        
    }

    // 생성자
    public Course(String title, String tutor, int days) {
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    // Setter
    public void  setTitle(String title) {
        this.title = title;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void setDays(int days) {
        this.days = days;
    }

    // Getter
    public String getTitle() {
        return this.title;
    }

    public String getTutor() {
        return this.tutor;
    }

    public int getDays() {
        return this.days;
    }

}
