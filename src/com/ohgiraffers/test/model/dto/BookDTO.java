package com.ohgiraffers.test.model.dto;

public class BookDTO {
    private int bNo;    //  도서 번호
    private int category;    // 도서 분류코드
    private String title;   //  도서 제목
    private String author;  //  도서 저자


    public void BookDTO() {

    }

    public void BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(java.lang.String author) {
        this.author = author;
    }

    public String toString() {
        return "BookDTO{" +
                "bNo=" + bNo +
                ", category=" + category +
                ", title=" + title +
                ", author=" + author +
                '}';
    }
}
