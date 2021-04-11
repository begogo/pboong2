import java.util.Scanner;

public class Menu {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {

            System.out.println("_____________________________________________");
            System.out.println("|               ㅡ Welcome to ㅡ             |");
            System.out.println("|               프붕이 취직하기 고!            |");
            System.out.println("|*******************************************|");
            System.out.println("|                                           |");
            System.out.println("|   원하시는 메뉴번호를 입력 후 엔터를 눌러주세요   |");
            System.out.println("|                                           |");
            System.out.println("| 1) 시작하기                                 |");
            System.out.println("| 2) 종료하기                                 |");
            System.out.println("|                                           |");
            System.out.println("|___________________________________________|");
            System.out.print("입력>>>");

            int menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("프붕이는 개발자가 되고자 마음먹었습니다.");
                    dayBegin();
                    break;
                case 2:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                    break;
            }

        }

    }



    static void dayBegin(){

        int condition = 100;
        int money = 1000000;
        int java = 0;
        int csKnowledge = 0;
        int codingTest = 0;

        for(int n=1; n>-1; n++){

            System.out.println("*************************************************");
            System.out.println("현재상태");
            System.out.println("컨디션: "+ condition + "          자금: " + money);
            System.out.println("자바 스킬: " + java + "         cs지식: " + csKnowledge);
            System.out.println("코딩테스트 능력: " + codingTest);
            System.out.println("*************************************************");
            System.out.println("Day-" + n + " 오늘은 무엇을 하시겠습니까?");
            System.out.println("1)공부 2)휴식 3)돈벌기 4)구직활동");
            int dayChoice = scan.nextInt();

            switch (dayChoice){

                case 1:
                    java += 5;
                    System.out.println("자바 스킬이 5점 올랐습니다."); //보충필요
                    break;
                case 2:
                    System.out.println("휴식하기"); //미구현
                    break;
                case 3:
                    System.out.println("돈벌기"); //미구현
                    break;
                case 4:
                    System.out.println("구직활동"); //미구현
                    break;
                default:
                    n--;
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                    break;
            }
        }

    }

}
