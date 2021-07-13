/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-12 16:26
 */
public class FamilyAccount {
    public static void main(String[] args) {

        String details = "收支"+"\t"+"账户金额"+"\t"+"\t"+"收支金额"+"\t"+"说明";
        int balance = 10000;
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("------家庭收支记账软件-------");
            System.out.println("       1.收支明细");
            System.out.println("        2.等级收入");
            System.out.println("        3.登记支出");
            System.out.println("        4.退出");
            System.out.println(     "请选择             "        );
            // 获取用户的选择 1-4
            char selection = Utility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("1.收支明细");
                    System.out.println("当前收支明细记录");
                    System.out.println(details);
                    System.out.println();
                    break;
                case '2':
                    System.out.println("2.等级收入");
                    System.out.println("本次收入金额");
                    int money = Utility.readNumber();
                    System.out.println("本次收入说明");
                    String info = Utility.readString();


                    balance+=money;

                    details += ("\n"+"\t"+balance+"\t\t" + money+"\t\t"+info+"\n");
                    break;

                case '3':
                    System.out.println("3.登记支出");
                    System.out.println("本次收支出金额");
                    int zhichu = Utility.readNumber();
                    System.out.println("本次支出说明：");
                    String zcsm = Utility.readString();
                    balance -=zhichu;
                    details += ("收支\t"+balance+"\t\t" + zhichu+"\t\t"+zcsm+"\n");

                    break;

                case '4':
                    System.out.println("4.退出");
                    System.out.println("确认是否退出（y/n）");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
                    break;



            }



        }
    }
}
