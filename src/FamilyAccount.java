/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-12 16:26
 */
public class FamilyAccount {
    public static void main(String[] args) {

        String details = "��֧"+"\t"+"�˻����"+"\t"+"\t"+"��֧���"+"\t"+"˵��";
        int balance = 10000;
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("------��ͥ��֧�������-------");
            System.out.println("       1.��֧��ϸ");
            System.out.println("        2.�ȼ�����");
            System.out.println("        3.�Ǽ�֧��");
            System.out.println("        4.�˳�");
            System.out.println(     "��ѡ��             "        );
            // ��ȡ�û���ѡ�� 1-4
            char selection = Utility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("1.��֧��ϸ");
                    System.out.println("��ǰ��֧��ϸ��¼");
                    System.out.println(details);
                    System.out.println();
                    break;
                case '2':
                    System.out.println("2.�ȼ�����");
                    System.out.println("����������");
                    int money = Utility.readNumber();
                    System.out.println("��������˵��");
                    String info = Utility.readString();


                    balance+=money;

                    details += ("\n"+"\t"+balance+"\t\t" + money+"\t\t"+info+"\n");
                    break;

                case '3':
                    System.out.println("3.�Ǽ�֧��");
                    System.out.println("������֧�����");
                    int zhichu = Utility.readNumber();
                    System.out.println("����֧��˵����");
                    String zcsm = Utility.readString();
                    balance -=zhichu;
                    details += ("��֧\t"+balance+"\t\t" + zhichu+"\t\t"+zcsm+"\n");

                    break;

                case '4':
                    System.out.println("4.�˳�");
                    System.out.println("ȷ���Ƿ��˳���y/n��");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
                    break;



            }



        }
    }
}
