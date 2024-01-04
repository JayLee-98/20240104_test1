package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {

    }

    public void menu() {
        System.out.println("================== 도서관리 프로그램을 실행합니다. ==================");
        System.out.println("1. 도서 추가하기");
        System.out.println("2. 도서 삭제하기");
        System.out.println("3. 도서 검색하기");
        System.out.println("9. 프로그램 종료하기");
        int receivedNum = sc.nextInt();
        sc.next();

        switch (receivedNum) {
            case 1:
                System.out.println("추가하고자하는 책의 이름을 입력해주세요 : ");
                String str = sc.nextLine();
                BookManager addBM = new BookManager();

                addBM.addBook(str);

                break;

            case 2:
                System.out.println("삭제하고자하는 책의 도서 번호을 입력해주세요 : ");
                int deleteBookNum = sc.nextInt();
                BookManager deleteBM = new BookManager();
                deleteBM.deleteBook(deleteBookNum);

                break;

            case 3:
                System.out.println("검색을 원하시는 도서 제목을 입력해주세요 : ");
                String searchBookName = sc.nextLine();
                BookManager searchBM = new BookManager();
                searchBM.searchBook(searchBookName);
                break;

            case 9:
                System.out.println("프로그램을 종료합니다.");
                break;

            default:
                System.out.println("잘못된 번호를 입력하셨습니다. 올바른 번호를 다시 선택해주십쇼.");
                return;
        }

    }

    public BookDTO inputBook() {
        String inquiry = bm.toString();
        return inquiry;
    }

    public String inputBookTitle() {

    }


}

