public class Study {

    static void chooseField(){

        while(true){

            System.out.println("어떤 분야를 공부하시겠습니까?");
            System.out.println("1)자바  2)CS  3)코테준비  4)뒤로");
            int choice = Menu.scan.nextInt();

            switch(choice){

                case 1:
                    if (Menu.condition >= 15) {
                        Menu.java += 5;
                        Menu.condition -= 15;
                        System.out.println("자바능력 레벨이 5 올랐습니다.");
                    } else {
                        Menu.day--;
                        System.out.println("컨디션이 부족합니다. 휴식이 필요합니다.");
                    }
                    return;
                case 2:
                    if (Menu.condition >= 15) {
                        Menu.csKnowledge += 5;
                        Menu.condition -= 15;
                        System.out.println("CS지식 레벨이 5 올랐습니다.");
                    } else {
                        Menu.day--;
                        System.out.println("컨디션이 부족합니다. 휴식이 필요합니다.");
                    }
                    return;
                case 3:
                    if (Menu.condition >= 15) {
                        Menu.codingTest += 5;
                        Menu.condition -= 15;
                        System.out.println("코딩테스트 레벨이 5 올랐습니다.");
                    } else {
                        Menu.day--;
                        System.out.println("컨디션이 부족합니다. 휴식이 필요합니다.");
                    }
                    return;
                case 4:
                    Menu.day--;
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                    break;
            }

        }

    }

}