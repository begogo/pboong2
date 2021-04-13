import java.util.Scanner;

/**
 * 객체지향 생각 안하고 단순하게 만들었습니다. 클래스간 변수 공유할 때 static 쓰면 안좋지만 일단 사용..
 */

public class Menu {

    static Scanner scan = new Scanner(System.in);
    static int condition = 100;
    static int money = 100000;
    static int java = 0;
    static int csKnowledge = 0;
    static int codingTest = 0;
    static int day = 1;

    public static void main(String[] args) {

        while(true) {

            System.out.println("_____________________________________________");
            System.out.println("|             ㅡ Welcome to ㅡ               |");
            System.out.println("|             프붕이 취직하기 고!             |");
            System.out.println("|*******************************************|");
            System.out.println("|                                           |");
            System.out.println("|  원하시는 메뉴번호를 입력 후 엔터를 눌러주세요 |");
            System.out.println("|                                           |");
            System.out.println("| 1) 시작하기                                |");
            System.out.println("| 2) 종료하기                                |");
            System.out.println("|___________________________________________|");
            System.out.print("입력>>>");

            int menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("프붕이는 개발자가 되고자 마음먹었습니다.");
                    begin();
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

    static void begin(){

        while(true){

            System.out.println("*************************************************");
            System.out.println("현재상태");
            System.out.println("컨디션: "+ condition + "          자금: " + money);
            System.out.println("자바 스킬: " + java + "         CS지식: " + csKnowledge);
            System.out.println("코딩테스트 능력: " + codingTest);
            System.out.println("*************************************************");
            System.out.println("Day-" + day + " 오늘은 무엇을 하시겠습니까?");
            System.out.println("1)공부  2)휴식  3)돈벌기  4)구직활동  5)메인메뉴로(현재상태 저장됨)");

            int dayChoice = scan.nextInt();
            day++;

            switch (dayChoice){

                case 1:
                    Study.run();
                    break;
                case 2:
                    Rest.run();
                    break;
                case 3:
                    Moneymaking.run();
                    break;
                case 4:
                    System.out.println("구직활동"); //미구현
                    break;
                case 5:
                    return;
                default:
                    day--;
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                    break;
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}